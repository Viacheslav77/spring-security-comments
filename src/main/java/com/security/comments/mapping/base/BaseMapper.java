package com.security.comments.mapping.base;

import java.util.List;
import java.util.stream.Collectors;


public interface BaseMapper {

  default <S, T> T map(S source, Class<T> targetClass) {
    return ModelMapperFactory.get().map(source, targetClass);
  }

  default <S, T> List<T> mapList(List<S> source, Class<T> targetClass) {
    return source
        .stream()
        .map(e -> map(e, targetClass))
        .collect(Collectors.toList());
  }

}

