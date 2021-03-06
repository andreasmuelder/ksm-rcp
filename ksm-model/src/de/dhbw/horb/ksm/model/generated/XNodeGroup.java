//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.27 at 01:09:52 PM MESZ 
//


package de.dhbw.horb.ksm.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NODEGROUP_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NODEGROUP_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="node" type="{http://www.ba-horb.de/~ksm/xml/ksm-1}NODE_TYPE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nodegroup" type="{http://www.ba-horb.de/~ksm/xml/ksm-1}NODEGROUP_TYPE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://www.ba-horb.de/~ksm/xml/ksm-1}PROPERTIES_TYPE"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.ba-horb.de/~ksm/xml/ksm-1}NODE_ID_TYPE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NODEGROUP_TYPE", propOrder = {
    "node",
    "nodegroup",
    "properties"
})
public class XNodeGroup {

    protected List<XNode> node;
    protected List<XNodeGroup> nodegroup;
    @XmlElement(required = true)
    protected XProperties properties;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the node property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the node property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XNode }
     * 
     * 
     */
    public List<XNode> getNode() {
        if (node == null) {
            node = new ArrayList<XNode>();
        }
        return this.node;
    }

    /**
     * Gets the value of the nodegroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodegroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodegroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XNodeGroup }
     * 
     * 
     */
    public List<XNodeGroup> getNodegroup() {
        if (nodegroup == null) {
            nodegroup = new ArrayList<XNodeGroup>();
        }
        return this.nodegroup;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link XProperties }
     *     
     */
    public XProperties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link XProperties }
     *     
     */
    public void setProperties(XProperties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
