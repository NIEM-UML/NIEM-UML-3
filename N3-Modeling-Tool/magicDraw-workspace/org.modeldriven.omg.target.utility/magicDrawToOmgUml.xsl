<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:uml='http://www.omg.org/spec/UML/20110701' 
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0" 
	xmlns:fn="http://www.w3.org/2005/xpath-functions"
	xmlns:xsd="http://www.w3.org/2001/XMLSchema"
	xmlns:xmi="http://www.omg.org/spec/XMI/20110701" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        exclude-result-prefixes="fn"
	>
	<xsl:output method="xml" encoding="UTF-8"/>
        <xsl:template match="@href[fn:contains(.,'.mdzip#')]">
                	<xsl:attribute name="href" select="fn:replace(.,'.mdzip#','.xmi#')"/>
        </xsl:template>

   <!-- elements to be copied -->     
        <xsl:template match="@*|node()">
                <xsl:copy >
                        <xsl:apply-templates select="@*|node()" />
                </xsl:copy>
        </xsl:template>
<!-- top-level -->        
        <xsl:template match="/">
                <xsl:apply-templates select="*" />
        </xsl:template>
</xsl:stylesheet>
