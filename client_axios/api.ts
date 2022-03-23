/* tslint:disable */
/* eslint-disable */
/**
 * Swagger WoW Comanion
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import { Configuration } from './configuration';
import globalAxios, { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from './common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from './base';

/**
 * 
 * @export
 * @interface CharacterArrayDTO
 */
export interface CharacterArrayDTO {
    /**
     * 
     * @type {Array<CharacterDTO>}
     * @memberof CharacterArrayDTO
     */
    'characterDTOs'?: Array<CharacterDTO>;
}
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
/**
 * 
 * @export
 * @interface CovenantDTO
 */
export interface CovenantDTO {
    /**
     * 
     * @type {number}
     * @memberof CovenantDTO
     */
    'id': number;
    /**
     * 
     * @type {string}
     * @memberof CovenantDTO
     */
    'mediaURL': string;
    /**
     * 
     * @type {LocalizedDTO}
     * @memberof CovenantDTO
     */
    'localizedDTO': LocalizedDTO;
}
/**
 * Covenant progress DTO
 * @export
 * @interface CovenantProgressDTO
 */
export interface CovenantProgressDTO {
    /**
     * 
     * @type {CovenantDTO}
     * @memberof CovenantProgressDTO
     */
    'covenantDTO'?: CovenantDTO;
    /**
     * 
     * @type {number}
     * @memberof CovenantProgressDTO
     */
    'renown_level': number;
}
/**
 * 
 * @export
 * @interface ExceptionDTO
 */
export interface ExceptionDTO {
    /**
     * 
     * @type {string}
     * @memberof ExceptionDTO
     */
    'details': string;
    /**
     * 
     * @type {string}
     * @memberof ExceptionDTO
     */
    'exception': string;
    /**
     * 
     * @type {string}
     * @memberof ExceptionDTO
     */
    'message': string;
    /**
     * 
     * @type {string}
     * @memberof ExceptionDTO
     */
    'timestamp': string;
}
/**
 * 
 * @export
 * @interface FactionDTO
 */
export interface FactionDTO {
    /**
     * 
     * @type {number}
     * @memberof FactionDTO
     */
    'id': number;
    /**
     * 
     * @type {string}
     * @memberof FactionDTO
     */
    'type': string;
    /**
     * 
     * @type {LocalizedDTO}
     * @memberof FactionDTO
     */
    'localizedDTO': LocalizedDTO;
}
/**
 * Guild index DTO
 * @export
 * @interface GuildIndexDTO
 */
export interface GuildIndexDTO {
    /**
     * 
     * @type {number}
     * @memberof GuildIndexDTO
     */
    'id': number;
    /**
     * 
     * @type {string}
     * @memberof GuildIndexDTO
     */
    'name': string;
    /**
     * 
     * @type {RealmDTO}
     * @memberof GuildIndexDTO
     */
    'realmDTO': RealmDTO;
    /**
     * 
     * @type {FactionDTO}
     * @memberof GuildIndexDTO
     */
    'factionDTO': FactionDTO;
    /**
     * 
     * @type {boolean}
     * @memberof GuildIndexDTO
     */
    'useApplication': boolean;
}
/**
 * 
 * @export
 * @interface LocalizedDTO
 */
export interface LocalizedDTO {
    /**
     * 
     * @type {string}
     * @memberof LocalizedDTO
     */
    'enUS': string;
    /**
     * 
     * @type {string}
     * @memberof LocalizedDTO
     */
    'esMX': string;
    /**
     * 
     * @type {string}
     * @memberof LocalizedDTO
     */
    'ptBR': string;
    /**
     * 
     * @type {string}
     * @memberof LocalizedDTO
     */
    'deDE': string;
    /**
     * 
     * @type {string}
     * @memberof LocalizedDTO
     */
    'enGB': string;
    /**
     * 
     * @type {string}
     * @memberof LocalizedDTO
     */
    'esES': string;
    /**
     * 
     * @type {string}
     * @memberof LocalizedDTO
     */
    'frFR': string;
    /**
     * 
     * @type {string}
     * @memberof LocalizedDTO
     */
    'itIT': string;
    /**
     * 
     * @type {string}
     * @memberof LocalizedDTO
     */
    'ruRU': string;
    /**
     * 
     * @type {string}
     * @memberof LocalizedDTO
     */
    'koKR': string;
    /**
     * 
     * @type {string}
     * @memberof LocalizedDTO
     */
    'zhTW': string;
    /**
     * 
     * @type {string}
     * @memberof LocalizedDTO
     */
    'zhCN': string;
}
/**
 * 
 * @export
 * @interface PlayableClassDTO
 */
export interface PlayableClassDTO {
    /**
     * 
     * @type {number}
     * @memberof PlayableClassDTO
     */
    'id': number;
    /**
     * 
     * @type {string}
     * @memberof PlayableClassDTO
     */
    'mediaURL': string;
    /**
     * 
     * @type {LocalizedDTO}
     * @memberof PlayableClassDTO
     */
    'localizedDTO': LocalizedDTO;
    /**
     * 
     * @type {Array<PlayableSpecializationDTO>}
     * @memberof PlayableClassDTO
     */
    'playableSpecializationDTOs': Array<PlayableSpecializationDTO>;
}
/**
 * 
 * @export
 * @interface PlayableRaceDTO
 */
export interface PlayableRaceDTO {
    /**
     * 
     * @type {number}
     * @memberof PlayableRaceDTO
     */
    'id': number;
    /**
     * 
     * @type {FactionDTO}
     * @memberof PlayableRaceDTO
     */
    'factionDTO': FactionDTO;
    /**
     * 
     * @type {LocalizedDTO}
     * @memberof PlayableRaceDTO
     */
    'localizedDTO': LocalizedDTO;
}
/**
 * 
 * @export
 * @interface PlayableSpecializationDTO
 */
export interface PlayableSpecializationDTO {
    /**
     * 
     * @type {number}
     * @memberof PlayableSpecializationDTO
     */
    'id': number;
    /**
     * 
     * @type {string}
     * @memberof PlayableSpecializationDTO
     */
    'mediaURL': string;
    /**
     * 
     * @type {number}
     * @memberof PlayableSpecializationDTO
     */
    'playableClassId': number;
    /**
     * 
     * @type {LocalizedDTO}
     * @memberof PlayableSpecializationDTO
     */
    'localizedDTO': LocalizedDTO;
    /**
     * 
     * @type {SpecializationRoleDTO}
     * @memberof PlayableSpecializationDTO
     */
    'specializationRoleDTO': SpecializationRoleDTO;
}
/**
 * 
 * @export
 * @interface RealmCategoryDTO
 */
export interface RealmCategoryDTO {
    /**
     * 
     * @type {number}
     * @memberof RealmCategoryDTO
     */
    'id': number;
    /**
     * 
     * @type {string}
     * @memberof RealmCategoryDTO
     */
    'slug': string;
    /**
     * 
     * @type {LocalizedDTO}
     * @memberof RealmCategoryDTO
     */
    'localizedDTO': LocalizedDTO;
}
/**
 * 
 * @export
 * @interface RealmDTO
 */
export interface RealmDTO {
    /**
     * 
     * @type {number}
     * @memberof RealmDTO
     */
    'id': number;
    /**
     * 
     * @type {string}
     * @memberof RealmDTO
     */
    'slug': string;
    /**
     * 
     * @type {string}
     * @memberof RealmDTO
     */
    'timezone': string;
    /**
     * 
     * @type {string}
     * @memberof RealmDTO
     */
    'locale': string;
    /**
     * 
     * @type {TypeDTO}
     * @memberof RealmDTO
     */
    'realmTypeDTO': TypeDTO;
    /**
     * 
     * @type {RealmRegionDTO}
     * @memberof RealmDTO
     */
    'realmRegionDTO': RealmRegionDTO;
    /**
     * 
     * @type {RealmCategoryDTO}
     * @memberof RealmDTO
     */
    'realmCategoryDTO': RealmCategoryDTO;
}
/**
 * 
 * @export
 * @interface RealmRegionDTO
 */
export interface RealmRegionDTO {
    /**
     * 
     * @type {number}
     * @memberof RealmRegionDTO
     */
    'id': number;
    /**
     * 
     * @type {LocalizedDTO}
     * @memberof RealmRegionDTO
     */
    'localizedDTO': LocalizedDTO;
}
/**
 * 
 * @export
 * @interface SpecializationRoleDTO
 */
export interface SpecializationRoleDTO {
    /**
     * 
     * @type {number}
     * @memberof SpecializationRoleDTO
     */
    'id': number;
    /**
     * 
     * @type {string}
     * @memberof SpecializationRoleDTO
     */
    'type': string;
    /**
     * 
     * @type {LocalizedDTO}
     * @memberof SpecializationRoleDTO
     */
    'localizedDTO': LocalizedDTO;
}
/**
 * 
 * @export
 * @interface StaticDataDTO
 */
export interface StaticDataDTO {
    /**
     * 
     * @type {Array<CovenantDTO>}
     * @memberof StaticDataDTO
     */
    'covenantDTOs': Array<CovenantDTO>;
    /**
     * 
     * @type {Array<PlayableRaceDTO>}
     * @memberof StaticDataDTO
     */
    'playableRaceDTOs': Array<PlayableRaceDTO>;
    /**
     * 
     * @type {Array<FactionDTO>}
     * @memberof StaticDataDTO
     */
    'factionDTOs': Array<FactionDTO>;
    /**
     * 
     * @type {Array<PlayableClassDTO>}
     * @memberof StaticDataDTO
     */
    'playableClassDTOs': Array<PlayableClassDTO>;
    /**
     * 
     * @type {Array<PlayableSpecializationDTO>}
     * @memberof StaticDataDTO
     */
    'playableSpecializationDTOs': Array<PlayableSpecializationDTO>;
    /**
     * 
     * @type {Array<SpecializationRoleDTO>}
     * @memberof StaticDataDTO
     */
    'specializationRoleDTOs': Array<SpecializationRoleDTO>;
    /**
     * 
     * @type {Array<RealmDTO>}
     * @memberof StaticDataDTO
     */
    'realmDTOs': Array<RealmDTO>;
}
/**
 * 
 * @export
 * @interface TypeDTO
 */
export interface TypeDTO {
    /**
     * 
     * @type {number}
     * @memberof TypeDTO
     */
    'id': number;
    /**
     * 
     * @type {string}
     * @memberof TypeDTO
     */
    'type': string;
    /**
     * 
     * @type {LocalizedDTO}
     * @memberof TypeDTO
     */
    'localizedDTO': LocalizedDTO;
}
/**
 * 
 * @export
 * @interface UserAccountIndexDTO
 */
export interface UserAccountIndexDTO {
    /**
     * 
     * @type {number}
     * @memberof UserAccountIndexDTO
     */
    'blizzardId': number;
    /**
     * 
     * @type {string}
     * @memberof UserAccountIndexDTO
     */
    'userName': string;
}
/**
 * 
 * @export
 * @interface UserDTO
 */
export interface UserDTO {
    /**
     * 
     * @type {string}
     * @memberof UserDTO
     */
    'userName': string;
    /**
     * 
     * @type {string}
     * @memberof UserDTO
     */
    'email': string;
    /**
     * 
     * @type {string}
     * @memberof UserDTO
     */
    'battletag': string;
    /**
     * 
     * @type {number}
     * @memberof UserDTO
     */
    'blizzardId': number;
    /**
     * 
     * @type {boolean}
     * @memberof UserDTO
     */
    'isAdmin': boolean;
}
/**
 * 
 * @export
 * @interface UserRegistrationParameter
 */
export interface UserRegistrationParameter {
    /**
     * 
     * @type {string}
     * @memberof UserRegistrationParameter
     */
    'userName': string;
    /**
     * 
     * @type {string}
     * @memberof UserRegistrationParameter
     */
    'email': string;
}

/**
 * AuthenticationApi - axios parameter creator
 * @export
 */
export const AuthenticationApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        testConnection: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/authentication/isConnected`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oAuthSample required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oAuthSample", [], configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        testRegistration: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/authentication/isRegistred`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oAuthSample required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oAuthSample", [], configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * AuthenticationApi - functional programming interface
 * @export
 */
export const AuthenticationApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = AuthenticationApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async testConnection(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.testConnection(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async testRegistration(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<boolean>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.testRegistration(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * AuthenticationApi - factory interface
 * @export
 */
export const AuthenticationApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = AuthenticationApiFp(configuration)
    return {
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        testConnection(options?: any): AxiosPromise<void> {
            return localVarFp.testConnection(options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        testRegistration(options?: any): AxiosPromise<boolean> {
            return localVarFp.testRegistration(options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * AuthenticationApi - object-oriented interface
 * @export
 * @class AuthenticationApi
 * @extends {BaseAPI}
 */
export class AuthenticationApi extends BaseAPI {
    /**
     * 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AuthenticationApi
     */
    public testConnection(options?: AxiosRequestConfig) {
        return AuthenticationApiFp(this.configuration).testConnection(options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AuthenticationApi
     */
    public testRegistration(options?: AxiosRequestConfig) {
        return AuthenticationApiFp(this.configuration).testRegistration(options).then((request) => request(this.axios, this.basePath));
    }
}


/**
 * BlizzardDataApi - axios parameter creator
 * @export
 */
export const BlizzardDataApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Fetch static data
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fetchStaticData: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/blizzardData/fetchStaticData`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oAuthSample required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oAuthSample", [], configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Get static data
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getStaticData: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/blizzardData/getStaticData`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oAuthSample required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oAuthSample", [], configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * BlizzardDataApi - functional programming interface
 * @export
 */
export const BlizzardDataApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = BlizzardDataApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary Fetch static data
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async fetchStaticData(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.fetchStaticData(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Get static data
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getStaticData(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<StaticDataDTO>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getStaticData(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * BlizzardDataApi - factory interface
 * @export
 */
export const BlizzardDataApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = BlizzardDataApiFp(configuration)
    return {
        /**
         * 
         * @summary Fetch static data
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fetchStaticData(options?: any): AxiosPromise<void> {
            return localVarFp.fetchStaticData(options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Get static data
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getStaticData(options?: any): AxiosPromise<StaticDataDTO> {
            return localVarFp.getStaticData(options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * BlizzardDataApi - object-oriented interface
 * @export
 * @class BlizzardDataApi
 * @extends {BaseAPI}
 */
export class BlizzardDataApi extends BaseAPI {
    /**
     * 
     * @summary Fetch static data
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof BlizzardDataApi
     */
    public fetchStaticData(options?: AxiosRequestConfig) {
        return BlizzardDataApiFp(this.configuration).fetchStaticData(options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Get static data
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof BlizzardDataApi
     */
    public getStaticData(options?: AxiosRequestConfig) {
        return BlizzardDataApiFp(this.configuration).getStaticData(options).then((request) => request(this.axios, this.basePath));
    }
}


/**
 * UserApi - axios parameter creator
 * @export
 */
export const UserApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Fetch characters from account
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fetchCharacters: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/character/fetchCharacters`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oAuthSample required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oAuthSample", [], configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Get characters from account
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getCharacters: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/character/getCharacters`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oAuthSample required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oAuthSample", [], configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Get user informations
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getUser: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/user`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oAuthSample required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oAuthSample", [], configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Register new account
         * @param {UserRegistrationParameter} [userRegistrationParameter] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        userRegistration: async (userRegistrationParameter?: UserRegistrationParameter, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/user/registration`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oAuthSample required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oAuthSample", [], configuration)


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(userRegistrationParameter, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * UserApi - functional programming interface
 * @export
 */
export const UserApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = UserApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary Fetch characters from account
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async fetchCharacters(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<CharacterArrayDTO>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.fetchCharacters(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Get characters from account
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getCharacters(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<CharacterArrayDTO>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getCharacters(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Get user informations
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getUser(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<UserDTO>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getUser(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Register new account
         * @param {UserRegistrationParameter} [userRegistrationParameter] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async userRegistration(userRegistrationParameter?: UserRegistrationParameter, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<UserDTO>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.userRegistration(userRegistrationParameter, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * UserApi - factory interface
 * @export
 */
export const UserApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = UserApiFp(configuration)
    return {
        /**
         * 
         * @summary Fetch characters from account
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fetchCharacters(options?: any): AxiosPromise<CharacterArrayDTO> {
            return localVarFp.fetchCharacters(options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Get characters from account
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getCharacters(options?: any): AxiosPromise<CharacterArrayDTO> {
            return localVarFp.getCharacters(options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Get user informations
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getUser(options?: any): AxiosPromise<UserDTO> {
            return localVarFp.getUser(options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Register new account
         * @param {UserRegistrationParameter} [userRegistrationParameter] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        userRegistration(userRegistrationParameter?: UserRegistrationParameter, options?: any): AxiosPromise<UserDTO> {
            return localVarFp.userRegistration(userRegistrationParameter, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * UserApi - object-oriented interface
 * @export
 * @class UserApi
 * @extends {BaseAPI}
 */
export class UserApi extends BaseAPI {
    /**
     * 
     * @summary Fetch characters from account
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof UserApi
     */
    public fetchCharacters(options?: AxiosRequestConfig) {
        return UserApiFp(this.configuration).fetchCharacters(options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Get characters from account
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof UserApi
     */
    public getCharacters(options?: AxiosRequestConfig) {
        return UserApiFp(this.configuration).getCharacters(options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Get user informations
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof UserApi
     */
    public getUser(options?: AxiosRequestConfig) {
        return UserApiFp(this.configuration).getUser(options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Register new account
     * @param {UserRegistrationParameter} [userRegistrationParameter] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof UserApi
     */
    public userRegistration(userRegistrationParameter?: UserRegistrationParameter, options?: AxiosRequestConfig) {
        return UserApiFp(this.configuration).userRegistration(userRegistrationParameter, options).then((request) => request(this.axios, this.basePath));
    }
}

