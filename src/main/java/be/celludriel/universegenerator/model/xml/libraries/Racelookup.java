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
 * <p>Java class for racelookup.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="racelookup"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="argon"/&gt;
 *     &lt;enumeration value="boron"/&gt;
 *     &lt;enumeration value="split"/&gt;
 *     &lt;enumeration value="drone"/&gt;
 *     &lt;enumeration value="khaak"/&gt;
 *     &lt;enumeration value="paranid"/&gt;
 *     &lt;enumeration value="teladi"/&gt;
 *     &lt;enumeration value="terran"/&gt;
 *     &lt;enumeration value="xenon"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "racelookup")
@XmlEnum
public enum Racelookup {


    /**
     * 
     *             Argon
     *           
     * 
     */
    @XmlEnumValue("argon")
    ARGON("argon"),

    /**
     * 
     *             Boron
     *           
     * 
     */
    @XmlEnumValue("boron")
    BORON("boron"),

    /**
     * 
     *             Split
     *           
     * 
     */
    @XmlEnumValue("split")
    SPLIT("split"),

    /**
     * 
     *             Drone
     *           
     * 
     */
    @XmlEnumValue("drone")
    DRONE("drone"),

    /**
     * 
     *             Kha'ak
     *           
     * 
     */
    @XmlEnumValue("khaak")
    KHAAK("khaak"),

    /**
     * 
     *             Paranid
     *           
     * 
     */
    @XmlEnumValue("paranid")
    PARANID("paranid"),

    /**
     * 
     *             Teladi
     *           
     * 
     */
    @XmlEnumValue("teladi")
    TELADI("teladi"),

    /**
     * 
     *             Terran
     *           
     * 
     */
    @XmlEnumValue("terran")
    TERRAN("terran"),

    /**
     * 
     *             Xenon
     *           
     * 
     */
    @XmlEnumValue("xenon")
    XENON("xenon");
    private final String value;

    Racelookup(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Racelookup fromValue(String v) {
        for (Racelookup c: Racelookup.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
