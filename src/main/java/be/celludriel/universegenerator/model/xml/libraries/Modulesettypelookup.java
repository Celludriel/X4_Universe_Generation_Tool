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
 * <p>Java class for modulesettypelookup.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="modulesettypelookup"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="defence"/&gt;
 *     &lt;enumeration value="equipmentdock"/&gt;
 *     &lt;enumeration value="factory"/&gt;
 *     &lt;enumeration value="tradingstation"/&gt;
 *     &lt;enumeration value="shipyard"/&gt;
 *     &lt;enumeration value="headquarters"/&gt;
 *     &lt;enumeration value="piratebase"/&gt;
 *     &lt;enumeration value="yakistation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "modulesettypelookup")
@XmlEnum
public enum Modulesettypelookup {

    @XmlEnumValue("defence")
    DEFENCE("defence"),
    @XmlEnumValue("equipmentdock")
    EQUIPMENTDOCK("equipmentdock"),
    @XmlEnumValue("factory")
    FACTORY("factory"),
    @XmlEnumValue("tradingstation")
    TRADINGSTATION("tradingstation"),
    @XmlEnumValue("shipyard")
    SHIPYARD("shipyard"),
    @XmlEnumValue("headquarters")
    HEADQUARTERS("headquarters"),
    @XmlEnumValue("piratebase")
    PIRATEBASE("piratebase"),
    @XmlEnumValue("yakistation")
    YAKISTATION("yakistation");
    private final String value;

    Modulesettypelookup(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Modulesettypelookup fromValue(String v) {
        for (Modulesettypelookup c: Modulesettypelookup.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}