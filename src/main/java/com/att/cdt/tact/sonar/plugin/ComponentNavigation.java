package com.att.cdt.tact.sonar.plugin;

import com.att.cdt.tact.sonar.plugin.ui.ComponentNavigationWidget;

import org.sonar.api.Properties;
import org.sonar.api.Property;
import org.sonar.api.SonarPlugin;

import java.util.Arrays;
import java.util.List;

public final class ComponentNavigation extends SonarPlugin {

  public List getExtensions() {
    return Arrays.asList(
      ComponentNavigationWidget.class
    );
  }
}
