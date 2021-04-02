//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.01 at 12:27:02 AM CEST 
//


package be.celludriel.universegenerator.model.xml.libraries;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terraformingpricescalelookup.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="terraformingpricescalelookup"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="absolute"/&gt;
 *     &lt;enumeration value="playeraccount"/&gt;
 *     &lt;enumeration value="population"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "terraformingpricescalelookup")
@XmlEnum
public enum Terraformingpricescalelookup {


    /**
     * 
     *             Defined price value is in Credits, not to be scaled.
     *           
     * 
     */
    @XmlEnumValue("absolute")
    ABSOLUTE("absolute"),

    /**
     * 
     *             Defined price value is a percentage applied to the player's current account.
     *           
     * 
     */
    @XmlEnumValue("playeraccount")
    PLAYERACCOUNT("playeraccount"),

    /**
     * 
     *             Price scales with the world's current population. Defined value is for 100k inhabitants.
     *           
     * 
     */
    @XmlEnumValue("population")
    POPULATION("population");
    private final String value;

    Terraformingpricescalelookup(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Terraformingpricescalelookup fromValue(String v) {
        for (Terraformingpricescalelookup c: Terraformingpricescalelookup.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
