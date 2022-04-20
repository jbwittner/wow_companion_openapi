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
 * RealmCategoryDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RealmCategoryDTO   {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("slug")
  private String slug;

  @JsonProperty("localizedData")
  private String localizedData;

  public RealmCategoryDTO id(Integer id) {
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

  public RealmCategoryDTO slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Get slug
   * @return slug
  */
  @NotNull 
  @Schema(name = "slug", required = true)
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public RealmCategoryDTO localizedData(String localizedData) {
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
    RealmCategoryDTO realmCategoryDTO = (RealmCategoryDTO) o;
    return Objects.equals(this.id, realmCategoryDTO.id) &&
        Objects.equals(this.slug, realmCategoryDTO.slug) &&
        Objects.equals(this.localizedData, realmCategoryDTO.localizedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, localizedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealmCategoryDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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

