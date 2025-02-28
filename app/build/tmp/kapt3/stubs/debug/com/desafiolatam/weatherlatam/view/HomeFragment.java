package com.desafiolatam.weatherlatam.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0013H\u0016J\u001a\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0016\u0010#\u001a\u00020\u00132\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J\b\u0010\'\u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006("}, d2 = {"Lcom/desafiolatam/weatherlatam/view/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/desafiolatam/weatherlatam/databinding/FragmentHomeBinding;", "adapter", "Lcom/desafiolatam/weatherlatam/view/adapter/WeatherAdapter;", "binding", "getBinding", "()Lcom/desafiolatam/weatherlatam/databinding/FragmentHomeBinding;", "tempUnit", "", "viewModel", "Lcom/desafiolatam/weatherlatam/view/viewmodel/WeatherViewModel;", "getViewModel", "()Lcom/desafiolatam/weatherlatam/view/viewmodel/WeatherViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getRemoteWeatherData", "", "getWeatherData", "initRecyclerView", "navigateToDetails", "navigateToSettings", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "populateRecyclerView", "list", "", "Lcom/desafiolatam/weatherlatam/model/WeatherDto;", "refresh", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private com.desafiolatam.weatherlatam.view.adapter.WeatherAdapter adapter;
    private java.lang.String tempUnit;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.desafiolatam.weatherlatam.databinding.FragmentHomeBinding _binding;
    
    public HomeFragment() {
        super();
    }
    
    private final com.desafiolatam.weatherlatam.view.viewmodel.WeatherViewModel getViewModel() {
        return null;
    }
    
    private final com.desafiolatam.weatherlatam.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getRemoteWeatherData() {
    }
    
    private final void getWeatherData() {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void populateRecyclerView(java.util.List<com.desafiolatam.weatherlatam.model.WeatherDto> list) {
    }
    
    private final void refresh() {
    }
    
    private final void navigateToDetails() {
    }
    
    private final void navigateToSettings() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
}