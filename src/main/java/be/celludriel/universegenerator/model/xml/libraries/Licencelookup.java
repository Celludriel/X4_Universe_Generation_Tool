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
 * <p>Java class for licencelookup.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="licencelookup"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="capitalequipment"/&gt;
 *     &lt;enumeration value="capitalship"/&gt;
 *     &lt;enumeration value="ceremonyfriend"/&gt;
 *     &lt;enumeration value="ceremonyally"/&gt;
 *     &lt;enumeration value="generaluseequipment"/&gt;
 *     &lt;enumeration value="generaluseship"/&gt;
 *     &lt;enumeration value="intelligence"/&gt;
 *     &lt;enumeration value="militaryequipment"/&gt;
 *     &lt;enumeration value="militaryship"/&gt;
 *     &lt;enumeration value="police"/&gt;
 *     &lt;enumeration value="station_gen_basic"/&gt;
 *     &lt;enumeration value="station_gen_intermediate"/&gt;
 *     &lt;enumeration value="station_gen_advanced"/&gt;
 *     &lt;enumeration value="station_equip_sm"/&gt;
 *     &lt;enumeration value="station_equip_lxl"/&gt;
 *     &lt;enumeration value="station_illegal"/&gt;
 *     &lt;enumeration value="station_race_basic"/&gt;
 *     &lt;enumeration value="station_race_intermediate"/&gt;
 *     &lt;enumeration value="station_race_advanced"/&gt;
 *     &lt;enumeration value="station_venture"/&gt;
 *     &lt;enumeration value="subgroupfriend"/&gt;
 *     &lt;enumeration value="tradesubscription"/&gt;
 *     &lt;enumeration value="innercore_access"/&gt;
 *     &lt;enumeration value="outercore_access"/&gt;
 *     &lt;enumeration value="shipsalecontract"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "licencelookup")
@XmlEnum
public enum Licencelookup {

    @XmlEnumValue("capitalequipment")
    CAPITALEQUIPMENT("capitalequipment"),
    @XmlEnumValue("capitalship")
    CAPITALSHIP("capitalship"),
    @XmlEnumValue("ceremonyfriend")
    CEREMONYFRIEND("ceremonyfriend"),
    @XmlEnumValue("ceremonyally")
    CEREMONYALLY("ceremonyally"),
    @XmlEnumValue("generaluseequipment")
    GENERALUSEEQUIPMENT("generaluseequipment"),
    @XmlEnumValue("generaluseship")
    GENERALUSESHIP("generaluseship"),
    @XmlEnumValue("intelligence")
    INTELLIGENCE("intelligence"),
    @XmlEnumValue("militaryequipment")
    MILITARYEQUIPMENT("militaryequipment"),
    @XmlEnumValue("militaryship")
    MILITARYSHIP("militaryship"),
    @XmlEnumValue("police")
    POLICE("police"),
    @XmlEnumValue("station_gen_basic")
    STATION_GEN_BASIC("station_gen_basic"),
    @XmlEnumValue("station_gen_intermediate")
    STATION_GEN_INTERMEDIATE("station_gen_intermediate"),
    @XmlEnumValue("station_gen_advanced")
    STATION_GEN_ADVANCED("station_gen_advanced"),
    @XmlEnumValue("station_equip_sm")
    STATION_EQUIP_SM("station_equip_sm"),
    @XmlEnumValue("station_equip_lxl")
    STATION_EQUIP_LXL("station_equip_lxl"),
    @XmlEnumValue("station_illegal")
    STATION_ILLEGAL("station_illegal"),
    @XmlEnumValue("station_race_basic")
    STATION_RACE_BASIC("station_race_basic"),
    @XmlEnumValue("station_race_intermediate")
    STATION_RACE_INTERMEDIATE("station_race_intermediate"),
    @XmlEnumValue("station_race_advanced")
    STATION_RACE_ADVANCED("station_race_advanced"),
    @XmlEnumValue("station_venture")
    STATION_VENTURE("station_venture"),
    @XmlEnumValue("subgroupfriend")
    SUBGROUPFRIEND("subgroupfriend"),
    @XmlEnumValue("tradesubscription")
    TRADESUBSCRIPTION("tradesubscription"),
    @XmlEnumValue("innercore_access")
    INNERCORE_ACCESS("innercore_access"),
    @XmlEnumValue("outercore_access")
    OUTERCORE_ACCESS("outercore_access"),
    @XmlEnumValue("shipsalecontract")
    SHIPSALECONTRACT("shipsalecontract");
    private final String value;

    Licencelookup(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Licencelookup fromValue(String v) {
        for (Licencelookup c: Licencelookup.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}