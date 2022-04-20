package fr.wowcompanion.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SpecializationRoleDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SpecializationRoleDTO   {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("type")
  private String type;

  @JsonProperty("localizedData")
  private String localizedData;

  public SpecializationRoleDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", required = true)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SpecializationRoleDTO type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "type", required = true)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SpecializationRoleDTO localizedData(String localizedData) {
    this.localizedData = localizedData;
    return this;
  }

  /**
   * Get localizedData
   * @return localizedData
  */
  @NotNull 
  @Schema(name = "localizedData", required = true)
  public String getLocalizedData() {
    return localizedData;
  }

  public void setLocalizedData(String localizedData) {
    this.localizedData = localizedData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecializationRoleDTO specializationRoleDTO = (SpecializationRoleDTO) o;
    return Objects.equals(this.id, specializationRoleDTO.id) &&
        Objects.equals(this.type, specializationRoleDTO.type) &&
        Objects.equals(this.localizedData, specializationRoleDTO.localizedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, localizedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecializationRoleDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    localizedData: ").append(toIndentedString(localizedData)).append("\n");
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

