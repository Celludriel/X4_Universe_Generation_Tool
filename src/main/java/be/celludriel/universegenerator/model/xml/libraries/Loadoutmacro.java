//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.01 at 12:27:02 AM CEST 
//


package be.celludriel.universegenerator.model.xml.libraries;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadoutmacro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadoutmacro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="macro" use="required" type="{}namestring" /&gt;
 *       &lt;attribute name="path" type="{}namestring" /&gt;
 *       &lt;attribute name="optional" type="{}boolean" /&gt;
 *       &lt;attribute name="ammmunition" type="{}namestring" /&gt;
 *       &lt;attribute name="weaponmode" type="{}extendedweaponmodelookup" /&gt;
 *       &lt;attribute name="debug" type="{}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadoutmacro")
public class Loadoutmacro {

    @XmlAttribute(name = "macro", required = true)
    protected String macro;
    @XmlAttribute(name = "path")
    protected String path;
    @XmlAttribute(name = "optional")
    protected Boolean optional;
    @XmlAttribute(name = "ammmunition")
    protected String ammmunition;
    @XmlAttribute(name = "weaponmode")
    protected List<String> weaponmode;
    @XmlAttribute(name = "debug")
    protected Boolean debug;

    /**
     * Gets the value of the macro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacro() {
        return macro;
    }

    /**
     * Sets the value of the macro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacro(String value) {
        this.macro = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the optional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptional() {
        return optional;
    }

    /**
     * Sets the value of the optional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptional(Boolean value) {
        this.optional = value;
    }

    /**
     * Gets the value of the ammmunition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmmmunition() {
        return ammmunition;
    }

    /**
     * Sets the value of the ammmunition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmmmunition(String value) {
        this.ammmunition = value;
    }

    /**
     * Gets the value of the weaponmode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weaponmode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeaponmode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWeaponmode() {
        if (weaponmode == null) {
            weaponmode = new ArrayList<String>();
        }
        return this.weaponmode;
    }

    /**
     * Gets the value of the debug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDebug() {
        return debug;
    }

    /**
     * Sets the value of the debug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDebug(Boolean value) {
        this.debug = value;
    }

}