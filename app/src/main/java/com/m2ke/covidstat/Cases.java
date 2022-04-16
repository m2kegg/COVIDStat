package com.m2ke.covidstat;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Cases {

    private String _new;
    private Integer active;
    private Integer critical;
    private Integer recovered;
    private String _1MPop;
    private Integer total;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getNew() {
        return _new;
    }

    public void setNew(String _new) {
        this._new = _new;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public Integer getRecovered() {
        return recovered;
    }

    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    public String get1MPop() {
        return _1MPop;
    }

    public void set1MPop(String _1MPop) {
        this._1MPop = _1MPop;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Cases.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_new");
        sb.append('=');
        sb.append(((this._new == null)?"<null>":this._new));
        sb.append(',');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("critical");
        sb.append('=');
        sb.append(((this.critical == null)?"<null>":this.critical));
        sb.append(',');
        sb.append("recovered");
        sb.append('=');
        sb.append(((this.recovered == null)?"<null>":this.recovered));
        sb.append(',');
        sb.append("_1MPop");
        sb.append('=');
        sb.append(((this._1MPop == null)?"<null>":this._1MPop));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
