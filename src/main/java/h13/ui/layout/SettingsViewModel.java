package h13.ui.layout;

import javafx.beans.property.BooleanProperty;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

import java.util.Map;
import java.util.Set;

import static org.tudalgo.algoutils.student.Student.crash;

/**
 * The viw model for {@link SettingsView} that handles the visibility of parameters based on the selected options.
 *
 * @author Nhan Huynh
 */
public class SettingsViewModel {

    /**
     * The options that can be selected.
     */
    private final Map<String, BooleanProperty> algorithms;

    /**
     * The parameters that can be visible.
     */
    private final Map<String, BooleanProperty> parameters;

    /**
     * Creates a new view model with the given options and parameters.
     *
     * @param algorithms the options that can be selected
     * @param parameters the parameters that can be visible
     */
    public SettingsViewModel(
        Map<String, BooleanProperty> algorithms,
        Map<String, BooleanProperty> parameters
    ) {
        this.algorithms = algorithms;
        this.parameters = parameters;
    }

    /**
     * Adds visibility listeners to the given parameters based on the given configurations.
     *
     * @param configurations the configurations that specify which parameters are visible for which options
     */
    @StudentImplementationRequired
    public void addVisibilityListener(Map<String, Set<String>> configurations) {
        crash(); // TODO: H4.2 - remove if implemented
    }
}
