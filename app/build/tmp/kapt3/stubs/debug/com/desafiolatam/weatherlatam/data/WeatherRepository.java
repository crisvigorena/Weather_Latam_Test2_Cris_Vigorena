package com.desafiolatam.weatherlatam.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n0\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J!\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/desafiolatam/weatherlatam/data/WeatherRepository;", "", "clearAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRemoteWeatherData", "Lkotlinx/coroutines/flow/Flow;", "Lcom/desafiolatam/weatherlatam/data/remote/ServiceResponse;", "Lcom/desafiolatam/weatherlatam/model/WeatherDto;", "getWeatherData", "", "getWeatherDataById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertData", "weatherDto", "(Lcom/desafiolatam/weatherlatam/model/WeatherDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface WeatherRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRemoteWeatherData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.desafiolatam.weatherlatam.data.remote.ServiceResponse<com.desafiolatam.weatherlatam.model.WeatherDto>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getWeatherData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.desafiolatam.weatherlatam.model.WeatherDto>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getWeatherDataById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.desafiolatam.weatherlatam.model.WeatherDto>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertData(@org.jetbrains.annotations.NotNull
    com.desafiolatam.weatherlatam.model.WeatherDto weatherDto, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object clearAll(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}