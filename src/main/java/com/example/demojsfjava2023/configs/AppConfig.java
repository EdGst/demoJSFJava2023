package com.example.demojsfjava2023.configs;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.annotation.FacesConfig;


@ApplicationScoped
@FacesConfig(version = FacesConfig.Version.JSF_2_3) // on active l'injection de dépendance avec le framework JFS
public class AppConfig {

}
