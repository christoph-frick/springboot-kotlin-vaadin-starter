package app.ui

import com.vaadin.annotations.Theme
import com.vaadin.annotations.Viewport
import com.vaadin.annotations.Widgetset
import com.vaadin.server.VaadinRequest
import com.vaadin.spring.annotation.SpringUI
import com.vaadin.ui.Label
import com.vaadin.ui.UI
import com.vaadin.ui.themes.ValoTheme

@SpringUI
@Widgetset("app")
@Theme(ValoTheme.THEME_NAME)
@Viewport("width=device-width, initial-scale=1.0")
class AppUI : UI() {
    override fun init(request: VaadinRequest?) {
        content = Label("Hello World").apply {
            addStyleName(ValoTheme.LABEL_H1)
        }
    }
}

