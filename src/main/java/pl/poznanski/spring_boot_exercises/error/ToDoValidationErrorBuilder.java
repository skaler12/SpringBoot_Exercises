package pl.poznanski.spring_boot_exercises.error;

import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
//errors
public class ToDoValidationErrorBuilder {
    public static ToDoValidationError fromBindingErrors(Errors errors) {
        ToDoValidationError error = new ToDoValidationError("Validation"
                 + errors.getErrorCount() + " error(s)");
        for (ObjectError objectError : errors.getAllErrors()) {
            error.addValidationError(objectError.getDefaultMessage());
        }
        return error;
    }
}