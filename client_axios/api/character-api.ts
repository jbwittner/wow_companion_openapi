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


import globalAxios, { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from '../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
// @ts-ignore
import { CharacterDTO } from '../model';
/**
 * CharacterApi - axios parameter creator
 * @export
 */
export const CharacterApiAxiosParamCreator = function (configuration?: Configuration) {
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
    }
};

/**
 * CharacterApi - functional programming interface
 * @export
 */
export const CharacterApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = CharacterApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary Fetch characters from account
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async fetchCharacters(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<CharacterDTO>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.fetchCharacters(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Get characters from account
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getCharacters(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<CharacterDTO>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getCharacters(options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * CharacterApi - factory interface
 * @export
 */
export const CharacterApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = CharacterApiFp(configuration)
    return {
        /**
         * 
         * @summary Fetch characters from account
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fetchCharacters(options?: any): AxiosPromise<Array<CharacterDTO>> {
            return localVarFp.fetchCharacters(options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Get characters from account
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getCharacters(options?: any): AxiosPromise<Array<CharacterDTO>> {
            return localVarFp.getCharacters(options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * CharacterApi - interface
 * @export
 * @interface CharacterApi
 */
export interface CharacterApiInterface {
    /**
     * 
     * @summary Fetch characters from account
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof CharacterApiInterface
     */
    fetchCharacters(options?: AxiosRequestConfig): AxiosPromise<Array<CharacterDTO>>;

    /**
     * 
     * @summary Get characters from account
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof CharacterApiInterface
     */
    getCharacters(options?: AxiosRequestConfig): AxiosPromise<Array<CharacterDTO>>;

}

/**
 * CharacterApi - object-oriented interface
 * @export
 * @class CharacterApi
 * @extends {BaseAPI}
 */
export class CharacterApi extends BaseAPI implements CharacterApiInterface {
    /**
     * 
     * @summary Fetch characters from account
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof CharacterApi
     */
    public fetchCharacters(options?: AxiosRequestConfig) {
        return CharacterApiFp(this.configuration).fetchCharacters(options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Get characters from account
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof CharacterApi
     */
    public getCharacters(options?: AxiosRequestConfig) {
        return CharacterApiFp(this.configuration).getCharacters(options).then((request) => request(this.axios, this.basePath));
    }
}
