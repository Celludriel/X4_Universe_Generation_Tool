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
 * <p>Java class for shiptypelookup.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="shiptypelookup"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="personalvehicle"/&gt;
 *     &lt;enumeration value="police"/&gt;
 *     &lt;enumeration value="xsdrone"/&gt;
 *     &lt;enumeration value="escapepod"/&gt;
 *     &lt;enumeration value="distressdrone"/&gt;
 *     &lt;enumeration value="lasertower"/&gt;
 *     &lt;enumeration value="scout"/&gt;
 *     &lt;enumeration value="fighter"/&gt;
 *     &lt;enumeration value="heavyfighter"/&gt;
 *     &lt;enumeration value="interceptor"/&gt;
 *     &lt;enumeration value="courier"/&gt;
 *     &lt;enumeration value="smalldrone"/&gt;
 *     &lt;enumeration value="bomber"/&gt;
 *     &lt;enumeration value="frigate"/&gt;
 *     &lt;enumeration value="corvette"/&gt;
 *     &lt;enumeration value="gunboat"/&gt;
 *     &lt;enumeration value="transporter"/&gt;
 *     &lt;enumeration value="miner"/&gt;
 *     &lt;enumeration value="personnelcarrier"/&gt;
 *     &lt;enumeration value="scavenger"/&gt;
 *     &lt;enumeration value="destroyer"/&gt;
 *     &lt;enumeration value="freighter"/&gt;
 *     &lt;enumeration value="largeminer"/&gt;
 *     &lt;enumeration value="carrier"/&gt;
 *     &lt;enumeration value="resupplier"/&gt;
 *     &lt;enumeration value="builder"/&gt;
 *     &lt;enumeration value="battleship"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "shiptypelookup")
@XmlEnum
public enum Shiptypelookup {

    @XmlEnumValue("personalvehicle")
    PERSONALVEHICLE("personalvehicle"),
    @XmlEnumValue("police")
    POLICE("police"),
    @XmlEnumValue("xsdrone")
    XSDRONE("xsdrone"),
    @XmlEnumValue("escapepod")
    ESCAPEPOD("escapepod"),
    @XmlEnumValue("distressdrone")
    DISTRESSDRONE("distressdrone"),
    @XmlEnumValue("lasertower")
    LASERTOWER("lasertower"),
    @XmlEnumValue("scout")
    SCOUT("scout"),
    @XmlEnumValue("fighter")
    FIGHTER("fighter"),
    @XmlEnumValue("heavyfighter")
    HEAVYFIGHTER("heavyfighter"),
    @XmlEnumValue("interceptor")
    INTERCEPTOR("interceptor"),
    @XmlEnumValue("courier")
    COURIER("courier"),
    @XmlEnumValue("smalldrone")
    SMALLDRONE("smalldrone"),
    @XmlEnumValue("bomber")
    BOMBER("bomber"),
    @XmlEnumValue("frigate")
    FRIGATE("frigate"),
    @XmlEnumValue("corvette")
    CORVETTE("corvette"),
    @XmlEnumValue("gunboat")
    GUNBOAT("gunboat"),
    @XmlEnumValue("transporter")
    TRANSPORTER("transporter"),
    @XmlEnumValue("miner")
    MINER("miner"),
    @XmlEnumValue("personnelcarrier")
    PERSONNELCARRIER("personnelcarrier"),
    @XmlEnumValue("scavenger")
    SCAVENGER("scavenger"),
    @XmlEnumValue("destroyer")
    DESTROYER("destroyer"),
    @XmlEnumValue("freighter")
    FREIGHTER("freighter"),
    @XmlEnumValue("largeminer")
    LARGEMINER("largeminer"),
    @XmlEnumValue("carrier")
    CARRIER("carrier"),
    @XmlEnumValue("resupplier")
    RESUPPLIER("resupplier"),
    @XmlEnumValue("builder")
    BUILDER("builder"),
    @XmlEnumValue("battleship")
    BATTLESHIP("battleship");
    private final String value;

    Shiptypelookup(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Shiptypelookup fromValue(String v) {
        for (Shiptypelookup c: Shiptypelookup.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}