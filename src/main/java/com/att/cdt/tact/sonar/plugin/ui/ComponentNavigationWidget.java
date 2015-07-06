package com.att.cdt.tact.sonar.plugin.ui;

import org.sonar.api.web.AbstractRubyTemplate;
import org.sonar.api.web.Description;
import org.sonar.api.web.RubyRailsWidget;
import org.sonar.api.web.UserRole;
import org.sonar.api.web.WidgetCategory;
import org.sonar.api.web.WidgetProperties;
import org.sonar.api.web.WidgetProperty;
import org.sonar.api.web.WidgetPropertyType;

@UserRole(UserRole.USER)
@Description("Navigate Components")
@WidgetCategory("Components")
@WidgetProperties({
  @WidgetProperty(
    key = "param1",
    description = "param desc",
    optional = true
  )
})
public class ComponentNavigationWidget extends AbstractRubyTemplate implements RubyRailsWidget {

  public String getId() {
    return "components";
  }

  public String getTitle() {
    return "Component Navigation";
  }

  @Override
  protected String getTemplatePath() {
    return "/widget/template.html.erb";
  }
}
