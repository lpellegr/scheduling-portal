//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.08 at 11:12:19 AM CEST 
//

package org.ow2.proactive_grid_cloud_portal.scheduler.server.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flowControlRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flowControlRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position" type="{}positionRecord" minOccurs="0"/>
 *         &lt;element name="size" type="{}sizeRecord" minOccurs="0"/>
 *         &lt;element name="continuation" type="{}continuationRecord" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flowControlRecord", propOrder = { "type", "position", "size", "continuation" })
@XmlSeeAlso( { IfElseRecord.class, ReplicatedRecord.class, LoopRecord.class })
public abstract class FlowControlRecord {

    protected String type;
    protected PositionRecord position;
    protected SizeRecord size;
    protected ContinuationRecord continuation;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link PositionRecord }
     *     
     */
    public PositionRecord getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionRecord }
     *     
     */
    public void setPosition(PositionRecord value) {
        this.position = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link SizeRecord }
     *     
     */
    public SizeRecord getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeRecord }
     *     
     */
    public void setSize(SizeRecord value) {
        this.size = value;
    }

    /**
     * Gets the value of the continuation property.
     * 
     * @return
     *     possible object is
     *     {@link ContinuationRecord }
     *     
     */
    public ContinuationRecord getContinuation() {
        return continuation;
    }

    /**
     * Sets the value of the continuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuationRecord }
     *     
     */
    public void setContinuation(ContinuationRecord value) {
        this.continuation = value;
    }

}
