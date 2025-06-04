
function signInForm() {
    const credentials = {
        email: document.getElementById('signinEmail').value,
        password: document.getElementById('signinPassword').value
    };

    fetch('http://localhost:8080/api/signin', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(credentials)
    }).then(response => response.json())
      .then(data => {
          if (data.email) {
              alert('Sign in successful!');
              document.getElementById('signinEmail').value = '';
              document.getElementById('signinPassword').value = '';
          } else {
              alert('Invalid credentials!');
              document.getElementById('signinEmail').value = '';
              document.getElementById('signinPassword').value = '';
          }
      })
      .catch(error => alert('Error signing in!'));

}
