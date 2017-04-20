package br.com.testepaggi.business.api.vo.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * © Copyright 2017.
 * Autor : Paulo Sales - paulovitorns@gmail.com
 */

public class PagamentoResponseVO {
    @SerializedName("total") public     int                             total;
    @SerializedName("result") public    List<PagamentoItemResponseVO>   result;
}
