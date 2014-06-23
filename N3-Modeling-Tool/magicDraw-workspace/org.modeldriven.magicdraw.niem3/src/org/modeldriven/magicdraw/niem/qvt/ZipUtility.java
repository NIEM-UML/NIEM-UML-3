/**
 * 
 */
package org.modeldriven.magicdraw.niem.qvt;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.CRC32;

import org.modeldriven.apache.zip.ZipEntry;
import org.modeldriven.apache.zip.ZipFile;
import org.modeldriven.apache.zip.ZipOutputStream;

/**
 * @author Tom
 *
 */
public class ZipUtility {

/*
	  public static final void zipDirectory( File directory, File zip ) throws IOException {
	    ZipOutputStream zos = new ZipOutputStream( new FileOutputStream( zip ) );
	    zip( directory, directory, zos );
	      zos.close();
	  }
	 
	  private static final void zip(File directory, File base,
	      ZipOutputStream zos) throws IOException {
	    File[] files = directory.listFiles();
	    byte[] buffer = new byte[8192];
	    int read = 0;
	    for (int i = 0, n = files.length; i < n; i++) {
	      if (files[i].isDirectory()) {
	        zip(files[i], base, zos);
	      } else {
	        FileInputStream in = new FileInputStream(files[i]);
	        ZipEntry entry = new ZipEntry(files[i].getPath().substring(
	            base.getPath().length() + 1));
	        zos.putNextEntry(entry);
	        while (-1 != (read = in.read(buffer))) {
	          zos.write(buffer, 0, read);
	        }
	        in.close();
	      }
	    }
	  }
*/
	/*
	  public static final void unzip(File zip, File extractTo) throws IOException {
	    ZipFile archive = new ZipFile(zip);
	    Enumeration e = archive.entries();
	    while (e.hasMoreElements()) {
	      ZipEntry entry = (ZipEntry) e.nextElement();
	      File file = new File(extractTo, entry.getName());
	      if (entry.isDirectory() && !file.exists()) {
	        file.mkdirs();
	      } else {
	        if (!file.getParentFile().exists()) {
	          file.getParentFile().mkdirs();
	        }

	        InputStream in = archive.getInputStream(entry);
	        BufferedOutputStream out = new BufferedOutputStream(
	            new FileOutputStream(file));

	        byte[] buffer = new byte[8192];
	        int read;

	        while (-1 != (read = in.read(buffer))) {
	          out.write(buffer, 0, read);
	        }

	        in.close();
	        out.close();
	      }
	    }
	  }
	  */
	  //////////////////////from open office extended per ant
	    public static void zipDirectory( File aDirToZip, File aTargetZipFileStr )
        throws FileNotFoundException, IOException
{
    FileOutputStream fos = new FileOutputStream( aTargetZipFileStr );
    ZipOutputStream zos = new ZipOutputStream( fos );

    String encoding=null;
    boolean useLanguageEncodingFlag = true;
//    UnicodeExtraField createUnicodeExtraFields =        UnicodeExtraField.NEVER;
    boolean fallBackToUTF8 = false;
    boolean doCompress = true;
    String comment = "";
    String prefix = "";
    int level = ZipOutputStream.DEFAULT_COMPRESSION;
    zos.setEncoding(encoding);
    zos.setUseLanguageEncodingFlag(useLanguageEncodingFlag);
//    zos.setCreateUnicodeExtraFields(createUnicodeExtraFields.getPolicy());
    zos.setCreateUnicodeExtraFields(ZipOutputStream.UnicodeExtraFieldPolicy.NEVER);
    
    zos.setFallbackToUTF8(fallBackToUTF8);
    zos.setMethod(doCompress
        ? ZipOutputStream.DEFLATED : ZipOutputStream.STORED);
    zos.setLevel(level);
    
    
    
    
    File[] aChildrenFiles = aDirToZip.listFiles();
    int nFileCount = aChildrenFiles.length;
    for( int i = 0 ; i < nFileCount ; i++ )
        addToZipRecursively( zos, aChildrenFiles[i], null );
    zos.setComment(comment);
    zos.close();
}
	    private static final long EMPTY_CRC = new CRC32 ().getValue ();
	    static private boolean roundUp = true;
	    private static final int ROUNDUP_MILLIS = 1999; // 2 seconds - 1

public static void addToZipRecursively( ZipOutputStream zos, File aFile, String aBasePath )
        throws FileNotFoundException, IOException
{
    if( aFile.isDirectory() )
{
        String aDirName = aFile.getName();
        /*
        if( aDirName.equalsIgnoreCase( "caption" ) || aDirName.equalsIgnoreCase( "content" ) )
            return;
*/
        String vPath = "";
        if( aBasePath != null )
        	vPath += aBasePath + "/";
        vPath += aDirName;

	        ZipEntry ze = new ZipEntry (vPath+"/");
	
	        // ZIPs store time with a granularity of 2 seconds, round up
	        int millisToAdd = roundUp ? ROUNDUP_MILLIS : 0;
	
	        if (aFile != null && aFile.exists()) {
	            ze.setTime(aFile.lastModified() + millisToAdd);
	        } else {
	            ze.setTime(System.currentTimeMillis() + millisToAdd);
	        }
	        ze.setSize (0);
	        ze.setMethod (ZipEntry.STORED);
	        // This is faintly ridiculous:
	        ze.setCrc (EMPTY_CRC);
	        //ze.setUnixMode(mode);
	/*
	        if (extra != null) {
	            ze.setExtraFields(extra);
	        }
	*/
	        zos.putNextEntry(ze);

        
        File[] aChildrenFiles = aFile.listFiles();
        String aNewBasePath = "";
        if( aBasePath != null )
            aNewBasePath += aBasePath + "/";//File.separator;
        aNewBasePath += aDirName;

        int nFileCount = aChildrenFiles.length;
        for( int i = 0 ; i < nFileCount ; i++ )
            addToZipRecursively( zos, aChildrenFiles[i], aNewBasePath );

        return;
    }

    // No directory
    // read contents of file we are going to put in the zip
    int fileLength = (int) aFile.length();
    FileInputStream fis = new FileInputStream( aFile );
    byte[] wholeFile = new byte[fileLength];
    int bytesRead = fis.read( wholeFile, 0, fileLength );
    fis.close();

    String aFileName = aFile.getName();
    String aEntryName = "";
    if( aBasePath != null )
        aEntryName += aBasePath + "/";
    aEntryName += aFileName;
    ZipEntry aZipEntry = new ZipEntry( aEntryName );
    aZipEntry.setTime( aFile.lastModified() );
    aZipEntry.setSize( fileLength );

    int nMethod = ( aFileName.toLowerCase().endsWith( ".jar" ) )
            ? ZipEntry.STORED : ZipEntry.DEFLATED;
    aZipEntry.setMethod( nMethod );

    CRC32 tempCRC = new CRC32();
    tempCRC.update( wholeFile, 0, wholeFile.length );
    aZipEntry.setCrc( tempCRC.getValue() );

    // write the contents into the zip element
    zos.putNextEntry( aZipEntry );
    zos.write( wholeFile, 0, fileLength );
    zos.closeEntry();
}
/**
 * Policiy for creation of Unicode extra fields: never, always or
 * not-encodeable.
 *
 * @since Ant 1.8.0
 */
/*
public static final class UnicodeExtraField extends EnumeratedAttribute {
    private static final Map POLICIES = new HashMap();
    private static final String NEVER_KEY = "never";
    private static final String ALWAYS_KEY = "always";
    private static final String N_E_KEY = "not-encodeable";
    static {
        POLICIES.put(NEVER_KEY,
                     ZipOutputStream.UnicodeExtraFieldPolicy.NEVER);
        POLICIES.put(ALWAYS_KEY,
                     ZipOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
        POLICIES.put(N_E_KEY,
                     ZipOutputStream.UnicodeExtraFieldPolicy
                     .NOT_ENCODEABLE);
    }

    public String[] getValues() {
        return new String[] {NEVER_KEY, ALWAYS_KEY, N_E_KEY};
    }

    public static final UnicodeExtraField NEVER =
        new UnicodeExtraField(NEVER_KEY);

    private UnicodeExtraField(String name) {
        setValue(name);
    }

    public UnicodeExtraField() {
    }

    public ZipOutputStream.UnicodeExtraFieldPolicy getPolicy() {
        return (ZipOutputStream.UnicodeExtraFieldPolicy)
            POLICIES.get(getValue());
    }
}
*/	
}
