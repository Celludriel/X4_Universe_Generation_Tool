//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.01 at 12:27:02 AM CEST 
//


package be.celludriel.universegenerator.model.xml.libraries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for matchwarelist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="matchwarelist"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="wares" use="required" type="{}expression" /&gt;
 *       &lt;attribute name="negate" type="{}negatefilter" /&gt;
 *       &lt;attribute name="comment" type="{}comment" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matchwarelist")
public class Matchwarelist {

    @XmlAttribute(name = "wares", required = true)
    protected String wares;
    @XmlAttribute(name = "negate")
    protected Boolean negate;
    @XmlAttribute(name = "comment")
    protected String comment;

    /**
     * Gets the value of the wares property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWares() {
        return wares;
    }

    /**
     * Sets the value of the wares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWares(String value) {
        this.wares = value;
    }

    /**
     * Gets the value of the negate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegate() {
        return negate;
    }

    /**
     * Sets the value of the negate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegate(Boolean value) {
        this.negate = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}