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
 * <p>Java class for weaponsystemlookup.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="weaponsystemlookup"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="drone_attack"/&gt;
 *     &lt;enumeration value="drone_defence"/&gt;
 *     &lt;enumeration value="drone_repair"/&gt;
 *     &lt;enumeration value="laser"/&gt;
 *     &lt;enumeration value="missile"/&gt;
 *     &lt;enumeration value="torpedo"/&gt;
 *     &lt;enumeration value="turret_shortrange"/&gt;
 *     &lt;enumeration value="turret_midrange"/&gt;
 *     &lt;enumeration value="turret_longrange"/&gt;
 *     &lt;enumeration value="turret_missile"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "weaponsystemlookup")
@XmlEnum
public enum Weaponsystemlookup {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("drone_attack")
    DRONE_ATTACK("drone_attack"),
    @XmlEnumValue("drone_defence")
    DRONE_DEFENCE("drone_defence"),
    @XmlEnumValue("drone_repair")
    DRONE_REPAIR("drone_repair"),
    @XmlEnumValue("laser")
    LASER("laser"),
    @XmlEnumValue("missile")
    MISSILE("missile"),
    @XmlEnumValue("torpedo")
    TORPEDO("torpedo"),
    @XmlEnumValue("turret_shortrange")
    TURRET_SHORTRANGE("turret_shortrange"),
    @XmlEnumValue("turret_midrange")
    TURRET_MIDRANGE("turret_midrange"),
    @XmlEnumValue("turret_longrange")
    TURRET_LONGRANGE("turret_longrange"),
    @XmlEnumValue("turret_missile")
    TURRET_MISSILE("turret_missile");
    private final String value;

    Weaponsystemlookup(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Weaponsystemlookup fromValue(String v) {
        for (Weaponsystemlookup c: Weaponsystemlookup.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
