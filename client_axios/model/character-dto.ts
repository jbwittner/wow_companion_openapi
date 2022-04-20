/* tslint:disable */
/* eslint-disable */
/**
 * Swagger WoW Comanion
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import { CovenantProgressDTO } from './covenant-progress-dto';
import { FactionDTO } from './faction-dto';
import { GuildIndexDTO } from './guild-index-dto';
import { PlayableClassDTO } from './playable-class-dto';
import { PlayableRaceDTO } from './playable-race-dto';
import { PlayableSpecializationDTO } from './playable-specialization-dto';
import { RealmDTO } from './realm-dto';
import { UserAccountIndexDTO } from './user-account-index-dto';

/**
 * 
 * @export
 * @interface CharacterDTO
 */
export interface CharacterDTO {
    /**
     * 
     * @type {number}
     * @memberof CharacterDTO
     */
    'id': number;
    /**
     * 
     * @type {string}
     * @memberof CharacterDTO
     */
    'name': string;
    /**
     * 
     * @type {number}
     * @memberof CharacterDTO
     */
    'level'?: number;
    /**
     * 
     * @type {PlayableSpecializationDTO}
     * @memberof CharacterDTO
     */
    'mainSpecilization'?: PlayableSpecializationDTO;
    /**
     * 
     * @type {RealmDTO}
     * @memberof CharacterDTO
     */
    'realmDTO': RealmDTO;
    /**
     * 
     * @type {PlayableClassDTO}
     * @memberof CharacterDTO
     */
    'playableClassDTO': PlayableClassDTO;
    /**
     * 
     * @type {PlayableRaceDTO}
     * @memberof CharacterDTO
     */
    'playableRaceDTO': PlayableRaceDTO;
    /**
     * 
     * @type {CovenantProgressDTO}
     * @memberof CharacterDTO
     */
    'covenantProgressDTO'?: CovenantProgressDTO;
    /**
     * 
     * @type {FactionDTO}
     * @memberof CharacterDTO
     */
    'factionDTO': FactionDTO;
    /**
     * 
     * @type {GuildIndexDTO}
     * @memberof CharacterDTO
     */
    'guildIndexDTO'?: GuildIndexDTO;
    /**
     * 
     * @type {UserAccountIndexDTO}
     * @memberof CharacterDTO
     */
    'userAccountIndexDTO'?: UserAccountIndexDTO;
    /**
     * 
     * @type {boolean}
     * @memberof CharacterDTO
     */
    'isFavorite': boolean;
    /**
     * 
     * @type {number}
     * @memberof CharacterDTO
     */
    'averageItemLevel'?: number;
    /**
     * 
     * @type {number}
     * @memberof CharacterDTO
     */
    'equippedItemLevel'?: number;
    /**
     * 
     * @type {number}
     * @memberof CharacterDTO
     */
    'lastLoginTimestamp'?: number;
    /**
     * 
     * @type {boolean}
     * @memberof CharacterDTO
     */
    'isActive': boolean;
    /**
     * 
     * @type {string}
     * @memberof CharacterDTO
     */
    'mediaAvatarURL'?: string;
    /**
     * 
     * @type {string}
     * @memberof CharacterDTO
     */
    'mediaInsetURL'?: string;
    /**
     * 
     * @type {string}
     * @memberof CharacterDTO
     */
    'mediaMainURL'?: string;
}

