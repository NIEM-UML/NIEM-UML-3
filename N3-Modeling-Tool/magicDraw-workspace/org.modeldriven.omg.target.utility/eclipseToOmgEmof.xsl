<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:uml='http://www.omg.org/spec/UML/20110701' 
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0" 
	xmlns:fn="http://www.w3.org/2005/xpath-functions"
	xmlns:xsd="http://www.w3.org/2001/XMLSchema"
	xmlns:xmi="http://www.omg.org/spec/XMI/20110701" 
	xmlns:xmiOLD="http://www.omg.org/XMI" 
	xmlns:emof="http://schema.omg.org/spec/MOF/2.0/emof.xml" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        exclude-result-prefixes="fn"
	>
	<xsl:output method="xml" encoding="UTF-8"/>
	<!-- 
	<xsl:namespace-alias stylesheet-prefix="xmiOLD" result-prefix="xmi"/>	
	 -->
        <xsl:template match="emof:Package">
                <xsl:copy copy-namespaces="no">
                	<xsl:namespace name="xmi" select="'http://www.omg.org/spec/XMI/20110701'"/>
                	<xsl:namespace name="emof" select="'http://schema.omg.org/spec/MOF/2.0/emof.xml'"/>
                        <xsl:apply-templates select="@*|node()" />
                </xsl:copy>
        </xsl:template>
        <xsl:template match="ownedAttribute[not(@xmiOLD:type)]">
                <xsl:copy copy-namespaces="no">
                	<xsl:attribute name="xmi:type" select="'emof:Property'"/>
                        <xsl:apply-templates select="@*|node()" />
                </xsl:copy>
        </xsl:template>
        <xsl:template match="ownedLiteral[not(@xmiOLD:type)]">
                <xsl:copy copy-namespaces="no">
                	<xsl:attribute name="xmi:type" select="'emof:EnumerationLiteral'"/>
                        <xsl:apply-templates select="@*|node()" />
                </xsl:copy>
        </xsl:template>
        <xsl:template match="nestedPackage[not(@xmiOLD:type)]">
                <xsl:copy copy-namespaces="no">
                	<xsl:attribute name="xmi:type" select="'emof:Package'"/>
                        <xsl:apply-templates select="@*|node()" />
                </xsl:copy>
        </xsl:template>
        <xsl:template match="@xmiOLD:type">
               	<xsl:attribute name="xmi:type" select="."/>
        </xsl:template>
        <xsl:template match="@xmiOLD:id">
               	<xsl:attribute name="xmi:id" select="."/>
        </xsl:template>
         
        <xsl:template match="@xmiOLD:version">
        </xsl:template>
        <xsl:template match="@xmiOLD:type[../@href]">
        </xsl:template>
        <xsl:template match="xmiOLD:Extension">
        </xsl:template>
   <!-- elements to be copied -->     
        <xsl:template match="@*|node()">
                <xsl:copy copy-namespaces="no">
                        <xsl:apply-templates select="@*|node()" />
                </xsl:copy>
        </xsl:template>
<!-- top-level -->        
        <xsl:template match="/">
                <xsl:apply-templates select="*" />
        </xsl:template>
</xsl:stylesheet>
