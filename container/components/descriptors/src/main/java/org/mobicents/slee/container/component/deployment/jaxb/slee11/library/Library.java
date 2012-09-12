/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.09.21 at 06:35:10 PM WEST 
//


package org.mobicents.slee.container.component.deployment.jaxb.slee11.library;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "libraryName",
    "libraryVendor",
    "libraryVersion",
    "eventTypeRef",
    "libraryRef",
    "profileSpecRef",
    "resourceAdaptorTypeRef",
    "sbbRef",
    "jar"
})
@XmlRootElement(name = "library")
public class Library {

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    protected Description description;
    @XmlElement(name = "library-name", required = true)
    protected LibraryName libraryName;
    @XmlElement(name = "library-vendor", required = true)
    protected LibraryVendor libraryVendor;
    @XmlElement(name = "library-version", required = true)
    protected LibraryVersion libraryVersion;
    @XmlElement(name = "event-type-ref")
    protected List<EventTypeRef> eventTypeRef;
    @XmlElement(name = "library-ref")
    protected List<LibraryRef> libraryRef;
    @XmlElement(name = "profile-spec-ref")
    protected List<ProfileSpecRef> profileSpecRef;
    @XmlElement(name = "resource-adaptor-type-ref")
    protected List<ResourceAdaptorTypeRef> resourceAdaptorTypeRef;
    @XmlElement(name = "sbb-ref")
    protected List<SbbRef> sbbRef;
    protected List<Jar> jar;

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

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the libraryName property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryName }
     *     
     */
    public LibraryName getLibraryName() {
        return libraryName;
    }

    /**
     * Sets the value of the libraryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryName }
     *     
     */
    public void setLibraryName(LibraryName value) {
        this.libraryName = value;
    }

    /**
     * Gets the value of the libraryVendor property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryVendor }
     *     
     */
    public LibraryVendor getLibraryVendor() {
        return libraryVendor;
    }

    /**
     * Sets the value of the libraryVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryVendor }
     *     
     */
    public void setLibraryVendor(LibraryVendor value) {
        this.libraryVendor = value;
    }

    /**
     * Gets the value of the libraryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryVersion }
     *     
     */
    public LibraryVersion getLibraryVersion() {
        return libraryVersion;
    }

    /**
     * Sets the value of the libraryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryVersion }
     *     
     */
    public void setLibraryVersion(LibraryVersion value) {
        this.libraryVersion = value;
    }

    /**
     * Gets the value of the eventTypeRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventTypeRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventTypeRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventTypeRef }
     * 
     * 
     */
    public List<EventTypeRef> getEventTypeRef() {
        if (eventTypeRef == null) {
            eventTypeRef = new ArrayList<EventTypeRef>();
        }
        return this.eventTypeRef;
    }

    /**
     * Gets the value of the libraryRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libraryRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibraryRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibraryRef }
     * 
     * 
     */
    public List<LibraryRef> getLibraryRef() {
        if (libraryRef == null) {
            libraryRef = new ArrayList<LibraryRef>();
        }
        return this.libraryRef;
    }

    /**
     * Gets the value of the profileSpecRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileSpecRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileSpecRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileSpecRef }
     * 
     * 
     */
    public List<ProfileSpecRef> getProfileSpecRef() {
        if (profileSpecRef == null) {
            profileSpecRef = new ArrayList<ProfileSpecRef>();
        }
        return this.profileSpecRef;
    }

    /**
     * Gets the value of the resourceAdaptorTypeRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceAdaptorTypeRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceAdaptorTypeRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceAdaptorTypeRef }
     * 
     * 
     */
    public List<ResourceAdaptorTypeRef> getResourceAdaptorTypeRef() {
        if (resourceAdaptorTypeRef == null) {
            resourceAdaptorTypeRef = new ArrayList<ResourceAdaptorTypeRef>();
        }
        return this.resourceAdaptorTypeRef;
    }

    /**
     * Gets the value of the sbbRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbbRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSbbRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SbbRef }
     * 
     * 
     */
    public List<SbbRef> getSbbRef() {
        if (sbbRef == null) {
            sbbRef = new ArrayList<SbbRef>();
        }
        return this.sbbRef;
    }

    /**
     * Gets the value of the jar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jar }
     * 
     * 
     */
    public List<Jar> getJar() {
        if (jar == null) {
            jar = new ArrayList<Jar>();
        }
        return this.jar;
    }

}