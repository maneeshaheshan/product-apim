/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.publisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.LifecycleStateAvailableTransitionBeanList;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.LifecycleStateCheckItemBeanList;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.LifecycleStateInputBeanList;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.LifecycleStatePermissionBeans;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.LifecycleStateValidationBeans;

/**
 * LifecycleState
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-27T17:28:03.315+05:30")
public class LifecycleState {
  @JsonProperty("lcName")
  private String lcName = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("lifecyelId")
  private String lifecyelId = null;

  @JsonProperty("checkItemBeanList")
  private List<LifecycleStateCheckItemBeanList> checkItemBeanList = null;

  @JsonProperty("inputBeanList")
  private List<LifecycleStateInputBeanList> inputBeanList = null;

  @JsonProperty("customCodeBeanList")
  private List<LifecycleStateValidationBeans> customCodeBeanList = null;

  @JsonProperty("availableTransitionBeanList")
  private List<LifecycleStateAvailableTransitionBeanList> availableTransitionBeanList = null;

  @JsonProperty("permissionBeanList")
  private List<LifecycleStatePermissionBeans> permissionBeanList = null;

  public LifecycleState lcName(String lcName) {
    this.lcName = lcName;
    return this;
  }

   /**
   * Get lcName
   * @return lcName
  **/
  @ApiModelProperty(example = "API Lifecycle", value = "")
  public String getLcName() {
    return lcName;
  }

  public void setLcName(String lcName) {
    this.lcName = lcName;
  }

  public LifecycleState state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "Created", value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public LifecycleState lifecyelId(String lifecyelId) {
    this.lifecyelId = lifecyelId;
    return this;
  }

   /**
   * Get lifecyelId
   * @return lifecyelId
  **/
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "")
  public String getLifecyelId() {
    return lifecyelId;
  }

  public void setLifecyelId(String lifecyelId) {
    this.lifecyelId = lifecyelId;
  }

  public LifecycleState checkItemBeanList(List<LifecycleStateCheckItemBeanList> checkItemBeanList) {
    this.checkItemBeanList = checkItemBeanList;
    return this;
  }

  public LifecycleState addCheckItemBeanListItem(LifecycleStateCheckItemBeanList checkItemBeanListItem) {
    if (this.checkItemBeanList == null) {
      this.checkItemBeanList = new ArrayList<LifecycleStateCheckItemBeanList>();
    }
    this.checkItemBeanList.add(checkItemBeanListItem);
    return this;
  }

   /**
   * Get checkItemBeanList
   * @return checkItemBeanList
  **/
  @ApiModelProperty(value = "")
  public List<LifecycleStateCheckItemBeanList> getCheckItemBeanList() {
    return checkItemBeanList;
  }

  public void setCheckItemBeanList(List<LifecycleStateCheckItemBeanList> checkItemBeanList) {
    this.checkItemBeanList = checkItemBeanList;
  }

  public LifecycleState inputBeanList(List<LifecycleStateInputBeanList> inputBeanList) {
    this.inputBeanList = inputBeanList;
    return this;
  }

  public LifecycleState addInputBeanListItem(LifecycleStateInputBeanList inputBeanListItem) {
    if (this.inputBeanList == null) {
      this.inputBeanList = new ArrayList<LifecycleStateInputBeanList>();
    }
    this.inputBeanList.add(inputBeanListItem);
    return this;
  }

   /**
   * Get inputBeanList
   * @return inputBeanList
  **/
  @ApiModelProperty(value = "")
  public List<LifecycleStateInputBeanList> getInputBeanList() {
    return inputBeanList;
  }

  public void setInputBeanList(List<LifecycleStateInputBeanList> inputBeanList) {
    this.inputBeanList = inputBeanList;
  }

  public LifecycleState customCodeBeanList(List<LifecycleStateValidationBeans> customCodeBeanList) {
    this.customCodeBeanList = customCodeBeanList;
    return this;
  }

  public LifecycleState addCustomCodeBeanListItem(LifecycleStateValidationBeans customCodeBeanListItem) {
    if (this.customCodeBeanList == null) {
      this.customCodeBeanList = new ArrayList<LifecycleStateValidationBeans>();
    }
    this.customCodeBeanList.add(customCodeBeanListItem);
    return this;
  }

   /**
   * Get customCodeBeanList
   * @return customCodeBeanList
  **/
  @ApiModelProperty(value = "")
  public List<LifecycleStateValidationBeans> getCustomCodeBeanList() {
    return customCodeBeanList;
  }

  public void setCustomCodeBeanList(List<LifecycleStateValidationBeans> customCodeBeanList) {
    this.customCodeBeanList = customCodeBeanList;
  }

  public LifecycleState availableTransitionBeanList(List<LifecycleStateAvailableTransitionBeanList> availableTransitionBeanList) {
    this.availableTransitionBeanList = availableTransitionBeanList;
    return this;
  }

  public LifecycleState addAvailableTransitionBeanListItem(LifecycleStateAvailableTransitionBeanList availableTransitionBeanListItem) {
    if (this.availableTransitionBeanList == null) {
      this.availableTransitionBeanList = new ArrayList<LifecycleStateAvailableTransitionBeanList>();
    }
    this.availableTransitionBeanList.add(availableTransitionBeanListItem);
    return this;
  }

   /**
   * Get availableTransitionBeanList
   * @return availableTransitionBeanList
  **/
  @ApiModelProperty(value = "")
  public List<LifecycleStateAvailableTransitionBeanList> getAvailableTransitionBeanList() {
    return availableTransitionBeanList;
  }

  public void setAvailableTransitionBeanList(List<LifecycleStateAvailableTransitionBeanList> availableTransitionBeanList) {
    this.availableTransitionBeanList = availableTransitionBeanList;
  }

  public LifecycleState permissionBeanList(List<LifecycleStatePermissionBeans> permissionBeanList) {
    this.permissionBeanList = permissionBeanList;
    return this;
  }

  public LifecycleState addPermissionBeanListItem(LifecycleStatePermissionBeans permissionBeanListItem) {
    if (this.permissionBeanList == null) {
      this.permissionBeanList = new ArrayList<LifecycleStatePermissionBeans>();
    }
    this.permissionBeanList.add(permissionBeanListItem);
    return this;
  }

   /**
   * Get permissionBeanList
   * @return permissionBeanList
  **/
  @ApiModelProperty(value = "")
  public List<LifecycleStatePermissionBeans> getPermissionBeanList() {
    return permissionBeanList;
  }

  public void setPermissionBeanList(List<LifecycleStatePermissionBeans> permissionBeanList) {
    this.permissionBeanList = permissionBeanList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LifecycleState lifecycleState = (LifecycleState) o;
    return Objects.equals(this.lcName, lifecycleState.lcName) &&
        Objects.equals(this.state, lifecycleState.state) &&
        Objects.equals(this.lifecyelId, lifecycleState.lifecyelId) &&
        Objects.equals(this.checkItemBeanList, lifecycleState.checkItemBeanList) &&
        Objects.equals(this.inputBeanList, lifecycleState.inputBeanList) &&
        Objects.equals(this.customCodeBeanList, lifecycleState.customCodeBeanList) &&
        Objects.equals(this.availableTransitionBeanList, lifecycleState.availableTransitionBeanList) &&
        Objects.equals(this.permissionBeanList, lifecycleState.permissionBeanList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lcName, state, lifecyelId, checkItemBeanList, inputBeanList, customCodeBeanList, availableTransitionBeanList, permissionBeanList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LifecycleState {\n");
    
    sb.append("    lcName: ").append(toIndentedString(lcName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    lifecyelId: ").append(toIndentedString(lifecyelId)).append("\n");
    sb.append("    checkItemBeanList: ").append(toIndentedString(checkItemBeanList)).append("\n");
    sb.append("    inputBeanList: ").append(toIndentedString(inputBeanList)).append("\n");
    sb.append("    customCodeBeanList: ").append(toIndentedString(customCodeBeanList)).append("\n");
    sb.append("    availableTransitionBeanList: ").append(toIndentedString(availableTransitionBeanList)).append("\n");
    sb.append("    permissionBeanList: ").append(toIndentedString(permissionBeanList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

