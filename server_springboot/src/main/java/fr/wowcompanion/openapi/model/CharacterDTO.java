package fr.wowcompanion.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.wowcompanion.openapi.model.CovenantProgressDTO;
import fr.wowcompanion.openapi.model.FactionDTO;
import fr.wowcompanion.openapi.model.GuildIndexDTO;
import fr.wowcompanion.openapi.model.PlayableClassDTO;
import fr.wowcompanion.openapi.model.PlayableRaceDTO;
import fr.wowcompanion.openapi.model.RealmDTO;
import fr.wowcompanion.openapi.model.UserAccountIndexDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CharacterDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CharacterDTO   {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("level")
  private Integer level;

  @JsonProperty("realmDTO")
  private RealmDTO realmDTO;

  @JsonProperty("playableClassDTO")
  private PlayableClassDTO playableClassDTO;

  @JsonProperty("playableRaceDTO")
  private PlayableRaceDTO playableRaceDTO;

  @JsonProperty("covenantProgressDTO")
  private CovenantProgressDTO covenantProgressDTO;

  @JsonProperty("factionDTO")
  private FactionDTO factionDTO;

  @JsonProperty("guildIndexDTO")
  private GuildIndexDTO guildIndexDTO;

  @JsonProperty("userAccountIndexDTO")
  private UserAccountIndexDTO userAccountIndexDTO;

  @JsonProperty("isFavorite")
  private Boolean isFavorite;

  @JsonProperty("averageItemLevel")
  private Integer averageItemLevel;

  @JsonProperty("equippedItemLevel")
  private Integer equippedItemLevel;

  @JsonProperty("lastLoginTimestamp")
  private Long lastLoginTimestamp;

  @JsonProperty("isActive")
  private Boolean isActive;

  @JsonProperty("mediaAvatarURL")
  private String mediaAvatarURL;

  @JsonProperty("mediaInsetURL")
  private String mediaInsetURL;

  @JsonProperty("mediaMainURL")
  private String mediaMainURL;

  public CharacterDTO id(Integer id) {
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

  public CharacterDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CharacterDTO level(Integer level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
  */
  
  @Schema(name = "level", required = false)
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public CharacterDTO realmDTO(RealmDTO realmDTO) {
    this.realmDTO = realmDTO;
    return this;
  }

  /**
   * Get realmDTO
   * @return realmDTO
  */
  @NotNull @Valid 
  @Schema(name = "realmDTO", required = true)
  public RealmDTO getRealmDTO() {
    return realmDTO;
  }

  public void setRealmDTO(RealmDTO realmDTO) {
    this.realmDTO = realmDTO;
  }

  public CharacterDTO playableClassDTO(PlayableClassDTO playableClassDTO) {
    this.playableClassDTO = playableClassDTO;
    return this;
  }

  /**
   * Get playableClassDTO
   * @return playableClassDTO
  */
  @NotNull @Valid 
  @Schema(name = "playableClassDTO", required = true)
  public PlayableClassDTO getPlayableClassDTO() {
    return playableClassDTO;
  }

  public void setPlayableClassDTO(PlayableClassDTO playableClassDTO) {
    this.playableClassDTO = playableClassDTO;
  }

  public CharacterDTO playableRaceDTO(PlayableRaceDTO playableRaceDTO) {
    this.playableRaceDTO = playableRaceDTO;
    return this;
  }

  /**
   * Get playableRaceDTO
   * @return playableRaceDTO
  */
  @NotNull @Valid 
  @Schema(name = "playableRaceDTO", required = true)
  public PlayableRaceDTO getPlayableRaceDTO() {
    return playableRaceDTO;
  }

  public void setPlayableRaceDTO(PlayableRaceDTO playableRaceDTO) {
    this.playableRaceDTO = playableRaceDTO;
  }

  public CharacterDTO covenantProgressDTO(CovenantProgressDTO covenantProgressDTO) {
    this.covenantProgressDTO = covenantProgressDTO;
    return this;
  }

  /**
   * Get covenantProgressDTO
   * @return covenantProgressDTO
  */
  @Valid 
  @Schema(name = "covenantProgressDTO", required = false)
  public CovenantProgressDTO getCovenantProgressDTO() {
    return covenantProgressDTO;
  }

  public void setCovenantProgressDTO(CovenantProgressDTO covenantProgressDTO) {
    this.covenantProgressDTO = covenantProgressDTO;
  }

  public CharacterDTO factionDTO(FactionDTO factionDTO) {
    this.factionDTO = factionDTO;
    return this;
  }

  /**
   * Get factionDTO
   * @return factionDTO
  */
  @NotNull @Valid 
  @Schema(name = "factionDTO", required = true)
  public FactionDTO getFactionDTO() {
    return factionDTO;
  }

  public void setFactionDTO(FactionDTO factionDTO) {
    this.factionDTO = factionDTO;
  }

  public CharacterDTO guildIndexDTO(GuildIndexDTO guildIndexDTO) {
    this.guildIndexDTO = guildIndexDTO;
    return this;
  }

  /**
   * Get guildIndexDTO
   * @return guildIndexDTO
  */
  @Valid 
  @Schema(name = "guildIndexDTO", required = false)
  public GuildIndexDTO getGuildIndexDTO() {
    return guildIndexDTO;
  }

  public void setGuildIndexDTO(GuildIndexDTO guildIndexDTO) {
    this.guildIndexDTO = guildIndexDTO;
  }

  public CharacterDTO userAccountIndexDTO(UserAccountIndexDTO userAccountIndexDTO) {
    this.userAccountIndexDTO = userAccountIndexDTO;
    return this;
  }

  /**
   * Get userAccountIndexDTO
   * @return userAccountIndexDTO
  */
  @Valid 
  @Schema(name = "userAccountIndexDTO", required = false)
  public UserAccountIndexDTO getUserAccountIndexDTO() {
    return userAccountIndexDTO;
  }

  public void setUserAccountIndexDTO(UserAccountIndexDTO userAccountIndexDTO) {
    this.userAccountIndexDTO = userAccountIndexDTO;
  }

  public CharacterDTO isFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

  /**
   * Get isFavorite
   * @return isFavorite
  */
  @NotNull 
  @Schema(name = "isFavorite", required = true)
  public Boolean getIsFavorite() {
    return isFavorite;
  }

  public void setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
  }

  public CharacterDTO averageItemLevel(Integer averageItemLevel) {
    this.averageItemLevel = averageItemLevel;
    return this;
  }

  /**
   * Get averageItemLevel
   * @return averageItemLevel
  */
  
  @Schema(name = "averageItemLevel", required = false)
  public Integer getAverageItemLevel() {
    return averageItemLevel;
  }

  public void setAverageItemLevel(Integer averageItemLevel) {
    this.averageItemLevel = averageItemLevel;
  }

  public CharacterDTO equippedItemLevel(Integer equippedItemLevel) {
    this.equippedItemLevel = equippedItemLevel;
    return this;
  }

  /**
   * Get equippedItemLevel
   * @return equippedItemLevel
  */
  
  @Schema(name = "equippedItemLevel", required = false)
  public Integer getEquippedItemLevel() {
    return equippedItemLevel;
  }

  public void setEquippedItemLevel(Integer equippedItemLevel) {
    this.equippedItemLevel = equippedItemLevel;
  }

  public CharacterDTO lastLoginTimestamp(Long lastLoginTimestamp) {
    this.lastLoginTimestamp = lastLoginTimestamp;
    return this;
  }

  /**
   * Get lastLoginTimestamp
   * @return lastLoginTimestamp
  */
  
  @Schema(name = "lastLoginTimestamp", required = false)
  public Long getLastLoginTimestamp() {
    return lastLoginTimestamp;
  }

  public void setLastLoginTimestamp(Long lastLoginTimestamp) {
    this.lastLoginTimestamp = lastLoginTimestamp;
  }

  public CharacterDTO isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
  */
  @NotNull 
  @Schema(name = "isActive", required = true)
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public CharacterDTO mediaAvatarURL(String mediaAvatarURL) {
    this.mediaAvatarURL = mediaAvatarURL;
    return this;
  }

  /**
   * Get mediaAvatarURL
   * @return mediaAvatarURL
  */
  
  @Schema(name = "mediaAvatarURL", required = false)
  public String getMediaAvatarURL() {
    return mediaAvatarURL;
  }

  public void setMediaAvatarURL(String mediaAvatarURL) {
    this.mediaAvatarURL = mediaAvatarURL;
  }

  public CharacterDTO mediaInsetURL(String mediaInsetURL) {
    this.mediaInsetURL = mediaInsetURL;
    return this;
  }

  /**
   * Get mediaInsetURL
   * @return mediaInsetURL
  */
  
  @Schema(name = "mediaInsetURL", required = false)
  public String getMediaInsetURL() {
    return mediaInsetURL;
  }

  public void setMediaInsetURL(String mediaInsetURL) {
    this.mediaInsetURL = mediaInsetURL;
  }

  public CharacterDTO mediaMainURL(String mediaMainURL) {
    this.mediaMainURL = mediaMainURL;
    return this;
  }

  /**
   * Get mediaMainURL
   * @return mediaMainURL
  */
  
  @Schema(name = "mediaMainURL", required = false)
  public String getMediaMainURL() {
    return mediaMainURL;
  }

  public void setMediaMainURL(String mediaMainURL) {
    this.mediaMainURL = mediaMainURL;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacterDTO characterDTO = (CharacterDTO) o;
    return Objects.equals(this.id, characterDTO.id) &&
        Objects.equals(this.name, characterDTO.name) &&
        Objects.equals(this.level, characterDTO.level) &&
        Objects.equals(this.realmDTO, characterDTO.realmDTO) &&
        Objects.equals(this.playableClassDTO, characterDTO.playableClassDTO) &&
        Objects.equals(this.playableRaceDTO, characterDTO.playableRaceDTO) &&
        Objects.equals(this.covenantProgressDTO, characterDTO.covenantProgressDTO) &&
        Objects.equals(this.factionDTO, characterDTO.factionDTO) &&
        Objects.equals(this.guildIndexDTO, characterDTO.guildIndexDTO) &&
        Objects.equals(this.userAccountIndexDTO, characterDTO.userAccountIndexDTO) &&
        Objects.equals(this.isFavorite, characterDTO.isFavorite) &&
        Objects.equals(this.averageItemLevel, characterDTO.averageItemLevel) &&
        Objects.equals(this.equippedItemLevel, characterDTO.equippedItemLevel) &&
        Objects.equals(this.lastLoginTimestamp, characterDTO.lastLoginTimestamp) &&
        Objects.equals(this.isActive, characterDTO.isActive) &&
        Objects.equals(this.mediaAvatarURL, characterDTO.mediaAvatarURL) &&
        Objects.equals(this.mediaInsetURL, characterDTO.mediaInsetURL) &&
        Objects.equals(this.mediaMainURL, characterDTO.mediaMainURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, level, realmDTO, playableClassDTO, playableRaceDTO, covenantProgressDTO, factionDTO, guildIndexDTO, userAccountIndexDTO, isFavorite, averageItemLevel, equippedItemLevel, lastLoginTimestamp, isActive, mediaAvatarURL, mediaInsetURL, mediaMainURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    realmDTO: ").append(toIndentedString(realmDTO)).append("\n");
    sb.append("    playableClassDTO: ").append(toIndentedString(playableClassDTO)).append("\n");
    sb.append("    playableRaceDTO: ").append(toIndentedString(playableRaceDTO)).append("\n");
    sb.append("    covenantProgressDTO: ").append(toIndentedString(covenantProgressDTO)).append("\n");
    sb.append("    factionDTO: ").append(toIndentedString(factionDTO)).append("\n");
    sb.append("    guildIndexDTO: ").append(toIndentedString(guildIndexDTO)).append("\n");
    sb.append("    userAccountIndexDTO: ").append(toIndentedString(userAccountIndexDTO)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    averageItemLevel: ").append(toIndentedString(averageItemLevel)).append("\n");
    sb.append("    equippedItemLevel: ").append(toIndentedString(equippedItemLevel)).append("\n");
    sb.append("    lastLoginTimestamp: ").append(toIndentedString(lastLoginTimestamp)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    mediaAvatarURL: ").append(toIndentedString(mediaAvatarURL)).append("\n");
    sb.append("    mediaInsetURL: ").append(toIndentedString(mediaInsetURL)).append("\n");
    sb.append("    mediaMainURL: ").append(toIndentedString(mediaMainURL)).append("\n");
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

