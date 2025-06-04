
function signUpForm() {
    const user = {
        name: document.getElementById('name').value,
        email: document.getElementById('email').value,
        phone: document.getElementById('phone').value,
        gender: document.querySelector('input[name="gender"]:checked') ? document.querySelector('input[name="gender"]:checked').value : null,
        birthday: document.getElementById('birthday').value,
        password: document.getElementById('password').value
    };

    fetch('http://localhost:8080/api/signup', {
        method: 'POST',
        headers: {
            'Content-Type' : 'application/json'
        },
        body: JSON.stringify(user)
    })
    .then(response => response.json())
    .then(data => {
        
        console.log('Success:', data);
        alert('Signup Successful!');

        document.getElementById('name').value = '';
        document.getElementById('email').value = '';
        document.getElementById('phone').value = '';
        document.querySelectorAll('input[name="gender"]').forEach(radio => radio.checked = false);
        document.getElementById('birthday').value = '';
        document.getElementById('password').value = '';
    })
    .catch((error) => {
        console.error('Error:', error);
        alert('Signup Fail!');
    });


}


