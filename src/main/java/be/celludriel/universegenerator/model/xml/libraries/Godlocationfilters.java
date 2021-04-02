//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.01 at 12:27:02 AM CEST 
//


package be.celludriel.universegenerator.model.xml.libraries;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for godlocationfilters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="godlocationfilters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="corerange" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="economy" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="min"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *                       &lt;minInclusive value="0.0"/&gt;
 *                       &lt;maxInclusive value="1.0"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="max"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *                       &lt;minInclusive value="0.0"/&gt;
 *                       &lt;maxInclusive value="1.0"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="maxbound" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="region" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="matchall" type="{}booleanexpression" /&gt;
 *                 &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="ware" use="required" type="{}expression" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="security" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="min"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *                       &lt;minInclusive value="0.0"/&gt;
 *                       &lt;maxInclusive value="1.0"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="max"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *                       &lt;minInclusive value="0.0"/&gt;
 *                       &lt;maxInclusive value="1.0"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sunlight" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="min"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *                       &lt;minInclusive value="0.0"/&gt;
 *                       &lt;maxInclusive value="10.0"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="max"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *                       &lt;minInclusive value="0.0"/&gt;
 *                       &lt;maxInclusive value="10.0"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="macro" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="faction" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="relation" type="{}relationlookup" /&gt;
 *       &lt;attribute name="comparison" type="{}relationcomparison" /&gt;
 *       &lt;attribute name="excluderinghighway" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="solitary" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="newzonechance" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="coreboundaryzoneheight" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="matchextension" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "godlocationfilters", propOrder = {
    "corerangeAndEconomyAndRegion"
})
public class Godlocationfilters {

    @XmlElements({
        @XmlElement(name = "corerange", type = Godlocationfilters.Corerange.class),
        @XmlElement(name = "economy", type = Godlocationfilters.Economy.class),
        @XmlElement(name = "region", type = Godlocationfilters.Region.class),
        @XmlElement(name = "security", type = Godlocationfilters.Security.class),
        @XmlElement(name = "sunlight", type = Godlocationfilters.Sunlight.class)
    })
    protected List<Object> corerangeAndEconomyAndRegion;
    @XmlAttribute(name = "macro")
    @XmlSchemaType(name = "anySimpleType")
    protected String macro;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "faction")
    @XmlSchemaType(name = "anySimpleType")
    protected String faction;
    @XmlAttribute(name = "relation")
    protected Relationlookup relation;
    @XmlAttribute(name = "comparison")
    protected Relationcomparison comparison;
    @XmlAttribute(name = "excluderinghighway")
    protected Boolean excluderinghighway;
    @XmlAttribute(name = "solitary")
    protected Boolean solitary;
    @XmlAttribute(name = "newzonechance")
    protected Float newzonechance;
    @XmlAttribute(name = "coreboundaryzoneheight")
    protected Float coreboundaryzoneheight;
    @XmlAttribute(name = "matchextension")
    protected Boolean matchextension;

    /**
     * Gets the value of the corerangeAndEconomyAndRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corerangeAndEconomyAndRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorerangeAndEconomyAndRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Godlocationfilters.Corerange }
     * {@link Godlocationfilters.Economy }
     * {@link Godlocationfilters.Region }
     * {@link Godlocationfilters.Security }
     * {@link Godlocationfilters.Sunlight }
     * 
     * 
     */
    public List<Object> getCorerangeAndEconomyAndRegion() {
        if (corerangeAndEconomyAndRegion == null) {
            corerangeAndEconomyAndRegion = new ArrayList<Object>();
        }
        return this.corerangeAndEconomyAndRegion;
    }

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
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the faction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaction() {
        return faction;
    }

    /**
     * Sets the value of the faction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaction(String value) {
        this.faction = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link Relationlookup }
     *     
     */
    public Relationlookup getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Relationlookup }
     *     
     */
    public void setRelation(Relationlookup value) {
        this.relation = value;
    }

    /**
     * Gets the value of the comparison property.
     * 
     * @return
     *     possible object is
     *     {@link Relationcomparison }
     *     
     */
    public Relationcomparison getComparison() {
        return comparison;
    }

    /**
     * Sets the value of the comparison property.
     * 
     * @param value
     *     allowed object is
     *     {@link Relationcomparison }
     *     
     */
    public void setComparison(Relationcomparison value) {
        this.comparison = value;
    }

    /**
     * Gets the value of the excluderinghighway property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcluderinghighway() {
        return excluderinghighway;
    }

    /**
     * Sets the value of the excluderinghighway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcluderinghighway(Boolean value) {
        this.excluderinghighway = value;
    }

    /**
     * Gets the value of the solitary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolitary() {
        return solitary;
    }

    /**
     * Sets the value of the solitary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolitary(Boolean value) {
        this.solitary = value;
    }

    /**
     * Gets the value of the newzonechance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNewzonechance() {
        return newzonechance;
    }

    /**
     * Sets the value of the newzonechance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNewzonechance(Float value) {
        this.newzonechance = value;
    }

    /**
     * Gets the value of the coreboundaryzoneheight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCoreboundaryzoneheight() {
        return coreboundaryzoneheight;
    }

    /**
     * Sets the value of the coreboundaryzoneheight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCoreboundaryzoneheight(Float value) {
        this.coreboundaryzoneheight = value;
    }

    /**
     * Gets the value of the matchextension property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchextension() {
        return matchextension;
    }

    /**
     * Sets the value of the matchextension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchextension(Boolean value) {
        this.matchextension = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
     *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Corerange {

        @XmlAttribute(name = "min")
        protected Float min;
        @XmlAttribute(name = "max")
        protected Float max;

        /**
         * Gets the value of the min property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getMin() {
            return min;
        }

        /**
         * Sets the value of the min property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setMin(Float value) {
            this.min = value;
        }

        /**
         * Gets the value of the max property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getMax() {
            return max;
        }

        /**
         * Sets the value of the max property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setMax(Float value) {
            this.max = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="min"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
     *             &lt;minInclusive value="0.0"/&gt;
     *             &lt;maxInclusive value="1.0"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="max"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
     *             &lt;minInclusive value="0.0"/&gt;
     *             &lt;maxInclusive value="1.0"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="maxbound" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Economy {

        @XmlAttribute(name = "min")
        protected Float min;
        @XmlAttribute(name = "max")
        protected Float max;
        @XmlAttribute(name = "maxbound")
        protected Boolean maxbound;

        /**
         * Gets the value of the min property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getMin() {
            return min;
        }

        /**
         * Sets the value of the min property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setMin(Float value) {
            this.min = value;
        }

        /**
         * Gets the value of the max property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getMax() {
            return max;
        }

        /**
         * Sets the value of the max property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setMax(Float value) {
            this.max = value;
        }

        /**
         * Gets the value of the maxbound property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMaxbound() {
            return maxbound;
        }

        /**
         * Sets the value of the maxbound property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMaxbound(Boolean value) {
            this.maxbound = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="matchall" type="{}booleanexpression" /&gt;
     *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="ware" use="required" type="{}expression" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Region {

        @XmlAttribute(name = "matchall")
        protected String matchall;
        @XmlAttribute(name = "min")
        protected BigInteger min;
        @XmlAttribute(name = "max")
        protected BigInteger max;
        @XmlAttribute(name = "ware", required = true)
        protected String ware;

        /**
         * Gets the value of the matchall property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMatchall() {
            return matchall;
        }

        /**
         * Sets the value of the matchall property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMatchall(String value) {
            this.matchall = value;
        }

        /**
         * Gets the value of the min property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMin() {
            return min;
        }

        /**
         * Sets the value of the min property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMin(BigInteger value) {
            this.min = value;
        }

        /**
         * Gets the value of the max property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMax() {
            return max;
        }

        /**
         * Sets the value of the max property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMax(BigInteger value) {
            this.max = value;
        }

        /**
         * Gets the value of the ware property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWare() {
            return ware;
        }

        /**
         * Sets the value of the ware property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWare(String value) {
            this.ware = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="min"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
     *             &lt;minInclusive value="0.0"/&gt;
     *             &lt;maxInclusive value="1.0"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="max"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
     *             &lt;minInclusive value="0.0"/&gt;
     *             &lt;maxInclusive value="1.0"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Security {

        @XmlAttribute(name = "min")
        protected Float min;
        @XmlAttribute(name = "max")
        protected Float max;

        /**
         * Gets the value of the min property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getMin() {
            return min;
        }

        /**
         * Sets the value of the min property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setMin(Float value) {
            this.min = value;
        }

        /**
         * Gets the value of the max property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getMax() {
            return max;
        }

        /**
         * Sets the value of the max property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setMax(Float value) {
            this.max = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="min"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
     *             &lt;minInclusive value="0.0"/&gt;
     *             &lt;maxInclusive value="10.0"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="max"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
     *             &lt;minInclusive value="0.0"/&gt;
     *             &lt;maxInclusive value="10.0"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Sunlight {

        @XmlAttribute(name = "min")
        protected Float min;
        @XmlAttribute(name = "max")
        protected Float max;

        /**
         * Gets the value of the min property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getMin() {
            return min;
        }

        /**
         * Sets the value of the min property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setMin(Float value) {
            this.min = value;
        }

        /**
         * Gets the value of the max property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getMax() {
            return max;
        }

        /**
         * Sets the value of the max property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setMax(Float value) {
            this.max = value;
        }

    }

}
