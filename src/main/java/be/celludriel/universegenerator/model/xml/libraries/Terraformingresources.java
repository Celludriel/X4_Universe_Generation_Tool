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
 * 
 *         Required resources. The amounts will be scaled, using the average prices, to reach the defined total price. If no resource wares are given this is a direct payment instead.
 *       
 * 
 * <p>Java class for terraformingresources complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="terraformingresources"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ware" type="{}terraformingwareamount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="price" use="required" type="{}expression" /&gt;
 *       &lt;attribute name="pricescale" type="{}terraformingpricescalelookup" /&gt;
 *       &lt;attribute name="payout" type="{}expression" /&gt;
 *       &lt;attribute name="minwares" type="{}expression" /&gt;
 *       &lt;attribute name="maxwares" type="{}expression" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terraformingresources", propOrder = {
    "ware"
})
public class Terraformingresources {

    protected List<Terraformingwareamount> ware;
    @XmlAttribute(name = "price", required = true)
    protected String price;
    @XmlAttribute(name = "pricescale")
    protected Terraformingpricescalelookup pricescale;
    @XmlAttribute(name = "payout")
    protected String payout;
    @XmlAttribute(name = "minwares")
    protected String minwares;
    @XmlAttribute(name = "maxwares")
    protected String maxwares;

    /**
     * Gets the value of the ware property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ware property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Terraformingwareamount }
     * 
     * 
     */
    public List<Terraformingwareamount> getWare() {
        if (ware == null) {
            ware = new ArrayList<Terraformingwareamount>();
        }
        return this.ware;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the pricescale property.
     * 
     * @return
     *     possible object is
     *     {@link Terraformingpricescalelookup }
     *     
     */
    public Terraformingpricescalelookup getPricescale() {
        return pricescale;
    }

    /**
     * Sets the value of the pricescale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terraformingpricescalelookup }
     *     
     */
    public void setPricescale(Terraformingpricescalelookup value) {
        this.pricescale = value;
    }

    /**
     * Gets the value of the payout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayout() {
        return payout;
    }

    /**
     * Sets the value of the payout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayout(String value) {
        this.payout = value;
    }

    /**
     * Gets the value of the minwares property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinwares() {
        return minwares;
    }

    /**
     * Sets the value of the minwares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinwares(String value) {
        this.minwares = value;
    }

    /**
     * Gets the value of the maxwares property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxwares() {
        return maxwares;
    }

    /**
     * Sets the value of the maxwares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxwares(String value) {
        this.maxwares = value;
    }

}
