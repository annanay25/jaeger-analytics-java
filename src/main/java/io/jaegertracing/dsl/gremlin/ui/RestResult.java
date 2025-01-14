package io.jaegertracing.dsl.gremlin.ui;

import java.util.List;

/**
 * @author Pavol Loffay
 */
public class RestResult<T> {

  private List<T> data;
  private List<Object> errors;

  public List<T> getData() {
    return data;
  }

  public void setData(List<T> data) {
    this.data = data;
  }

  public List<Object> getErrors() {
    return errors;
  }

  public void setErrors(List<Object> errors) {
    this.errors = errors;
  }
}
