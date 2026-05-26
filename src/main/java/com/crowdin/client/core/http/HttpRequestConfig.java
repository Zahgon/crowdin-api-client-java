package com.crowdin.client.core.http;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Configuration for http request (query parameters, headers)
 */
public class HttpRequestConfig {

    private Map<String, ? extends Optional> urlParams = new HashMap<>();

    private Map<String, ?> headers = new HashMap<>();

    public HttpRequestConfig(Map<String, Optional<?>> urlParams, Map<String, ?> headers) {
        this.urlParams = urlParams;
        this.headers = headers;
    }

    public HttpRequestConfig(Map<String, ? extends Optional> urlParams) {
        this.urlParams = urlParams;
    }

    public HttpRequestConfig() {
    }

    public Map<String, ? extends Optional> getUrlParams() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setUrlParams(Map<String, Optional<?>> urlParams) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<String, ?> getHeaders() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setHeaders(Map<String, ?> headers) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Optional> Map<String, T> buildUrlParams(String k1, T v1) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Optional> Map<String, T> buildUrlParams(String k1, T v1, String k2, T v2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Optional> Map<String, T> buildUrlParams(String k1, T v1, String k2, T v2, String k3, T v3) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Optional> Map<String, T> buildUrlParams(String k1, T v1, String k2, T v2, String k3, T v3, String k4, T v4) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Optional> Map<String, T> buildUrlParams(String k1, T v1, String k2, T v2, String k3, T v3, String k4, T v4, String k5, T v5) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Optional> Map<String, T> buildUrlParams(String k1, T v1, String k2, T v2, String k3, T v3, String k4, T v4, String k5, T v5, String k6, T v6) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Optional> Map<String, T> buildUrlParams(String k1, T v1, String k2, T v2, String k3, T v3, String k4, T v4, String k5, T v5, String k6, T v6, String k7, T v7) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Optional> Map<String, T> buildUrlParams(String k1, T v1, String k2, T v2, String k3, T v3, String k4, T v4, String k5, T v5, String k6, T v6, String k7, T v7, String k8, T v8) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Optional> Map<String, T> buildUrlParams(String k1, T v1, String k2, T v2, String k3, T v3, String k4, T v4, String k5, T v5, String k6, T v6, String k7, T v7, String k8, T v8, String k9, T v9) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Optional> Map<String, T> buildUrlParams(String k1, T v1, String k2, T v2, String k3, T v3, String k4, T v4, String k5, T v5, String k6, T v6, String k7, T v7, String k8, T v8, String k9, T v9, String k10, T v10) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Optional> Map<String, T> buildUrlParams(String k1, T v1, String k2, T v2, String k3, T v3, String k4, T v4, String k5, T v5, String k6, T v6, String k7, T v7, String k8, T v8, String k9, T v9, String k10, T v10, String k11, T v11) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Optional> Map<String, T> buildUrlParams(String k1, T v1, String k2, T v2, String k3, T v3, String k4, T v4, String k5, T v5, String k6, T v6, String k7, T v7, String k8, T v8, String k9, T v9, String k10, T v10, String k11, T v11, String k12, T v12) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Optional> Map<String, T> buildUrlParams(String k1, T v1, String k2, T v2, String k3, T v3, String k4, T v4, String k5, T v5, String k6, T v6, String k7, T v7, String k8, T v8, String k9, T v9, String k10, T v10, String k11, T v11, String k12, T v12, String k13, T v13) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Optional> Map<String, T> buildUrlParams(String k1, T v1, String k2, T v2, String k3, T v3, String k4, T v4, String k5, T v5, String k6, T v6, String k7, T v7, String k8, T v8, String k9, T v9, String k10, T v10, String k11, T v11, String k12, T v12, String k13, T v13, String k14, T v14) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
