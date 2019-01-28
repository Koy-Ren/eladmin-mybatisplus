package com.hemiao100.commons.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 响应实体
 */
@Data
public class JsonResponse<T> implements Serializable {

  private static final long serialVersionUID = 7415411055978144939L;

  /**
   * 成功响应
   */
  public static final String STATUS_SUCC = "0";
  public static final String STATUS_SUCC_MSG = "操作成功！";
  /**
   * 失败响应
   */
  public static final String STATUS_FAIL = "-1";

  private T data;
  private String code;
  private String msg;

  /**
   * 若没有数据返回，默认状态码为0，提示信息为：操作成功！
   */
  public JsonResponse() {
    this.code = STATUS_SUCC;
    this.msg = STATUS_SUCC_MSG;
  }

  /**
   * 若没有数据返回，可以人为指定状态码和提示信息
   *
   * @param code
   * @param msg
   */
  public JsonResponse(String code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  /**
   * 有数据返回时，状态码为0，默认提示信息为：操作成功！
   *
   * @param data
   */
  public JsonResponse(T data) {
    this.data = data;
    this.code = STATUS_SUCC;
    this.msg = STATUS_SUCC_MSG;
  }

  /**
   * 有数据返回，状态码为0，人为指定提示信息
   *
   * @param data
   * @param msg
   */
  public JsonResponse(T data, String msg) {
    this.data = data;
    this.code = STATUS_SUCC;
    this.msg = msg;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
