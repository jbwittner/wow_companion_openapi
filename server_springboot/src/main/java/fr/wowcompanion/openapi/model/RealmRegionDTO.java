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
 * RealmRegionDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RealmRegionDTO   {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("localizedData")
  private String localizedData;

  public RealmRegionDTO id(Integer id) {
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

  public RealmRegionDTO localizedData(String localizedData) {
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
    RealmRegionDTO realmRegionDTO = (RealmRegionDTO) o;
    return Objects.equals(this.id, realmRegionDTO.id) &&
        Objects.equals(this.localizedData, realmRegionDTO.localizedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, localizedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealmRegionDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

