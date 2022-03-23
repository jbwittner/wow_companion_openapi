package fr.myguild.server.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.myguild.server.generated.model.RealmCategoryDTO;
import fr.myguild.server.generated.model.RealmRegionDTO;
import fr.myguild.server.generated.model.TypeDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RealmDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RealmDTO   {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("slug")
  private String slug;

  @JsonProperty("timezone")
  private String timezone;

  @JsonProperty("locale")
  private String locale;

  @JsonProperty("realmTypeDTO")
  private TypeDTO realmTypeDTO;

  @JsonProperty("realmRegionDTO")
  private RealmRegionDTO realmRegionDTO;

  @JsonProperty("realmCategoryDTO")
  private RealmCategoryDTO realmCategoryDTO;

  public RealmDTO id(Integer id) {
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

  public RealmDTO slug(String slug) {
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

  public RealmDTO timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Get timezone
   * @return timezone
  */
  @NotNull 
  @Schema(name = "timezone", required = true)
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public RealmDTO locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
  */
  @NotNull 
  @Schema(name = "locale", required = true)
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public RealmDTO realmTypeDTO(TypeDTO realmTypeDTO) {
    this.realmTypeDTO = realmTypeDTO;
    return this;
  }

  /**
   * Get realmTypeDTO
   * @return realmTypeDTO
  */
  @NotNull @Valid 
  @Schema(name = "realmTypeDTO", required = true)
  public TypeDTO getRealmTypeDTO() {
    return realmTypeDTO;
  }

  public void setRealmTypeDTO(TypeDTO realmTypeDTO) {
    this.realmTypeDTO = realmTypeDTO;
  }

  public RealmDTO realmRegionDTO(RealmRegionDTO realmRegionDTO) {
    this.realmRegionDTO = realmRegionDTO;
    return this;
  }

  /**
   * Get realmRegionDTO
   * @return realmRegionDTO
  */
  @NotNull @Valid 
  @Schema(name = "realmRegionDTO", required = true)
  public RealmRegionDTO getRealmRegionDTO() {
    return realmRegionDTO;
  }

  public void setRealmRegionDTO(RealmRegionDTO realmRegionDTO) {
    this.realmRegionDTO = realmRegionDTO;
  }

  public RealmDTO realmCategoryDTO(RealmCategoryDTO realmCategoryDTO) {
    this.realmCategoryDTO = realmCategoryDTO;
    return this;
  }

  /**
   * Get realmCategoryDTO
   * @return realmCategoryDTO
  */
  @NotNull @Valid 
  @Schema(name = "realmCategoryDTO", required = true)
  public RealmCategoryDTO getRealmCategoryDTO() {
    return realmCategoryDTO;
  }

  public void setRealmCategoryDTO(RealmCategoryDTO realmCategoryDTO) {
    this.realmCategoryDTO = realmCategoryDTO;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealmDTO realmDTO = (RealmDTO) o;
    return Objects.equals(this.id, realmDTO.id) &&
        Objects.equals(this.slug, realmDTO.slug) &&
        Objects.equals(this.timezone, realmDTO.timezone) &&
        Objects.equals(this.locale, realmDTO.locale) &&
        Objects.equals(this.realmTypeDTO, realmDTO.realmTypeDTO) &&
        Objects.equals(this.realmRegionDTO, realmDTO.realmRegionDTO) &&
        Objects.equals(this.realmCategoryDTO, realmDTO.realmCategoryDTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, timezone, locale, realmTypeDTO, realmRegionDTO, realmCategoryDTO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealmDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    realmTypeDTO: ").append(toIndentedString(realmTypeDTO)).append("\n");
    sb.append("    realmRegionDTO: ").append(toIndentedString(realmRegionDTO)).append("\n");
    sb.append("    realmCategoryDTO: ").append(toIndentedString(realmCategoryDTO)).append("\n");
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

