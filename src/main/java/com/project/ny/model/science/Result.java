package com.project.ny.model.science;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Result{
    public String section;
    public String subsection;
    public String title;
    //public String abstract;
    public String url;
    public String uri;
    public String byline;
    public String item_type;
    public Date updated_date;
    @JsonProperty("created_date")
    public Date createdDate;
    
    @JsonProperty("published_date")
    public Date publishedDate;
    
    @JsonProperty("material_type_facet")
    public String materialTypeFacet;
    public String kicker;
    
    @JsonProperty("des_facet")
    public List<String> desFacet;
    
    @JsonProperty("org_facet")
    public List<String> orgFacet;
    
    @JsonProperty("per_facet")
    public List<String> perFacet;
    
    @JsonProperty("geo_facet")
    public List<String> geoFacet;
    
    public List<Multimedia> multimedia;
    
    public String short_url;

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getSubsection() {
		return subsection;
	}

	public void setSubsection(String subsection) {
		this.subsection = subsection;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getByline() {
		return byline;
	}

	public void setByline(String byline) {
		this.byline = byline;
	}

	public String getItem_type() {
		return item_type;
	}

	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getMaterialTypeFacet() {
		return materialTypeFacet;
	}

	public void setMaterialTypeFacet(String materialTypeFacet) {
		this.materialTypeFacet = materialTypeFacet;
	}

	public String getKicker() {
		return kicker;
	}

	public void setKicker(String kicker) {
		this.kicker = kicker;
	}

	public List<String> getDesFacet() {
		return desFacet;
	}

	public void setDesFacet(List<String> desFacet) {
		this.desFacet = desFacet;
	}

	public List<String> getOrgFacet() {
		return orgFacet;
	}

	public void setOrgFacet(List<String> orgFacet) {
		this.orgFacet = orgFacet;
	}

	public List<String> getPerFacet() {
		return perFacet;
	}

	public void setPerFacet(List<String> perFacet) {
		this.perFacet = perFacet;
	}

	public List<String> getGeoFacet() {
		return geoFacet;
	}

	public void setGeoFacet(List<String> geoFacet) {
		this.geoFacet = geoFacet;
	}

	public List<Multimedia> getMultimedia() {
		return multimedia;
	}

	public void setMultimedia(List<Multimedia> multimedia) {
		this.multimedia = multimedia;
	}

	public String getShort_url() {
		return short_url;
	}

	public void setShort_url(String short_url) {
		this.short_url = short_url;
	}
    
    
}