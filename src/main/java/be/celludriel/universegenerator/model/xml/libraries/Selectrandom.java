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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for selectrandom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="selectrandom"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{}selectrandom"/&gt;
 *       &lt;attGroup ref="{}random"/&gt;
 *       &lt;attribute name="selection" type="{}selectionlookup" /&gt;
 *       &lt;attribute name="comment" type="{}comment" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectrandom", propOrder = {
    "select"
})
public class Selectrandom {

    protected List<Selectrandom.Select> select;
    @XmlAttribute(name = "selection")
    protected Selectionlookup selection;
    @XmlAttribute(name = "comment")
    protected String comment;
    @XmlAttribute(name = "exact")
    protected String exact;
    @XmlAttribute(name = "list")
    protected String list;
    @XmlAttribute(name = "min")
    protected String min;
    @XmlAttribute(name = "max")
    protected String max;
    @XmlAttribute(name = "profile")
    protected Profilelookup profile;
    @XmlAttribute(name = "scale")
    protected BigInteger scale;
    @XmlAttribute(name = "seed")
    protected String seed;

    /**
     * Gets the value of the select property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the select property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Selectrandom.Select }
     * 
     * 
     */
    public List<Selectrandom.Select> getSelect() {
        if (select == null) {
            select = new ArrayList<Selectrandom.Select>();
        }
        return this.select;
    }

    /**
     * Gets the value of the selection property.
     * 
     * @return
     *     possible object is
     *     {@link Selectionlookup }
     *     
     */
    public Selectionlookup getSelection() {
        return selection;
    }

    /**
     * Sets the value of the selection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Selectionlookup }
     *     
     */
    public void setSelection(Selectionlookup value) {
        this.selection = value;
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

    /**
     * Gets the value of the exact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExact() {
        return exact;
    }

    /**
     * Sets the value of the exact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExact(String value) {
        this.exact = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setList(String value) {
        this.list = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMin(String value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMax(String value) {
        this.max = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link Profilelookup }
     *     
     */
    public Profilelookup getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profilelookup }
     *     
     */
    public void setProfile(Profilelookup value) {
        this.profile = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScale(BigInteger value) {
        this.scale = value;
    }

    /**
     * Gets the value of the seed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeed() {
        return seed;
    }

    /**
     * Sets the value of the seed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeed(String value) {
        this.seed = value;
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
     *       &lt;attGroup ref="{}random"/&gt;
     *       &lt;attribute name="weight" type="{}selectionweight" /&gt;
     *       &lt;attribute name="comment" type="{}comment" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Select {

        @XmlAttribute(name = "weight")
        protected BigInteger weight;
        @XmlAttribute(name = "comment")
        protected String comment;
        @XmlAttribute(name = "exact")
        protected String exact;
        @XmlAttribute(name = "list")
        protected String list;
        @XmlAttribute(name = "min")
        protected String min;
        @XmlAttribute(name = "max")
        protected String max;
        @XmlAttribute(name = "profile")
        protected Profilelookup profile;
        @XmlAttribute(name = "scale")
        protected BigInteger scale;
        @XmlAttribute(name = "seed")
        protected String seed;

        /**
         * Gets the value of the weight property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWeight() {
            return weight;
        }

        /**
         * Sets the value of the weight property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWeight(BigInteger value) {
            this.weight = value;
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

        /**
         * Gets the value of the exact property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExact() {
            return exact;
        }

        /**
         * Sets the value of the exact property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExact(String value) {
            this.exact = value;
        }

        /**
         * Gets the value of the list property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getList() {
            return list;
        }

        /**
         * Sets the value of the list property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setList(String value) {
            this.list = value;
        }

        /**
         * Gets the value of the min property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMin() {
            return min;
        }

        /**
         * Sets the value of the min property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMin(String value) {
            this.min = value;
        }

        /**
         * Gets the value of the max property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMax() {
            return max;
        }

        /**
         * Sets the value of the max property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMax(String value) {
            this.max = value;
        }

        /**
         * Gets the value of the profile property.
         * 
         * @return
         *     possible object is
         *     {@link Profilelookup }
         *     
         */
        public Profilelookup getProfile() {
            return profile;
        }

        /**
         * Sets the value of the profile property.
         * 
         * @param value
         *     allowed object is
         *     {@link Profilelookup }
         *     
         */
        public void setProfile(Profilelookup value) {
            this.profile = value;
        }

        /**
         * Gets the value of the scale property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getScale() {
            return scale;
        }

        /**
         * Sets the value of the scale property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setScale(BigInteger value) {
            this.scale = value;
        }

        /**
         * Gets the value of the seed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeed() {
            return seed;
        }

        /**
         * Sets the value of the seed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeed(String value) {
            this.seed = value;
        }

    }

}