document.addEventListener('DOMContentLoaded', function() {
    const submitBtn = document.getElementById('submitBtn');
    const termsYes = document.getElementById('termsYes');
    const termsNo = document.getElementById('termsNo');

    function toggleSubmitButton() {
        submitBtn.disabled = !termsYes.checked;
    }

    termsYes.addEventListener('change', toggleSubmitButton);
    termsNo.addEventListener('change', toggleSubmitButton);

    const nameField = document.getElementById('name');
    const emailField = document.getElementById('email');
    const passwordField = document.getElementById('password');
    const birthdateField = document.getElementById('birthdate');
    const genderField = document.getElementById('gender');

    nameField.addEventListener('input', validateName);
    emailField.addEventListener('input', validateEmail);
    passwordField.addEventListener('input', validatePassword);
    birthdateField.addEventListener('input', validateBirthdate);
    genderField.addEventListener('change', validateGender);

    function validateName() {
        const name = nameField.value;
        if (name === '') {
            document.getElementById('nameError').textContent = 'Name is required';
        } else {
            document.getElementById('nameError').textContent = '';
        }
    }

    function validateEmail() {
        const email = emailField.value;
        const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (email === '' || !emailPattern.test(email)) {
            document.getElementById('emailError').textContent = 'Valid email is required';
        } else {
            document.getElementById('emailError').textContent = '';
        }
    }

    function validatePassword() {
        const password = passwordField.value;
        if (password === '' || password.length < 6) {
            document.getElementById('passwordError').textContent = 'Password must be at least 6 characters long';
        } else {
            document.getElementById('passwordError').textContent = '';
        }
    }

    function validateBirthdate() {
        const birthdate = birthdateField.value;
        const year = birthdate.split('-')[0];
        if (birthdate === '' || year.length > 4) {
            document.getElementById('birthdateError').textContent = 'Valid birthdate is required';
        } else {
            document.getElementById('birthdateError').textContent = '';
        }
    }

    function validateGender() {
        const gender = genderField.value;
        if (gender === '') {
            document.getElementById('genderError').textContent = 'Gender is required';
        } else {
            document.getElementById('genderError').textContent = '';
        }
    }

    document.getElementById('sampleForm').addEventListener('submit', function(event) {
        event.preventDefault(); // Prevent form submission
        
        // Final validation before submission
        validateName();
        validateEmail();
        validatePassword();
        validateBirthdate();
        validateGender();
        toggleSubmitButton();

        // Check if there are any validation errors
        const nameError = document.getElementById('nameError').textContent;
        const emailError = document.getElementById('emailError').textContent;
        const passwordError = document.getElementById('passwordError').textContent;
        const birthdateError = document.getElementById('birthdateError').textContent;
        const genderError = document.getElementById('genderError').textContent;
        const termsError = document.getElementById('termsError').textContent;

        if (!nameError && !emailError && !passwordError && !birthdateError && !genderError && !termsError && termsYes.checked) {
            // Form is valid, you can submit it or perform further actions
            alert('Form submitted successfully');
        }
    });
});
