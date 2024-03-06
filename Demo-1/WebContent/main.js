/**
 * 
 */
function validateForm() {
	
	document.getElementById('error-message').innerHTML='';
	const nameInput = document.getElementById('name');
	const emailInput = document.getElementById('email');
	const countrySelect = document.getElementById('country');
	const stateSelect = document.getElementById('state');
	const agreeCheckbox = document.getElementById('agreeCheckbox');

	const nameRegex = /^[A-Za-z ]+$/;
	const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
	
	
	if (!nameRegex.test(nameInput.value)) {
		errorMessage('Name should allow only alphabets.');
		return false;
	}

	else if (!emailRegex.test(emailInput.value)) {
		errorMessage('Invalid email format.');
		return false;
	}
	else if(countrySelect.value==''){
		errorMessage('Please Select the Country');
		return false;
	}
	else if(stateSelect.value===''){
		errorMessage('Please Select the State');
		return false
	}
	else if (!agreeCheckbox.checked) {
		errorMessage('Please agree to the terms and conditions.');
		return false;
	}

	return true;
}
function errorMessage(message){
	document.getElementById('error-message').innerHTML=message;
}


const stateObject = {
		'India' : [ 'Andhra Pradesh', 'Telengana', 'Karnataka' ],
		'USA' : [ 'Texas', 'New York', 'california' ],
		'UK' : [ 'England', 'Scotland', 'Wales' ]
	};

	function stateFunction() {
		let countrySelect = document.getElementById('country');
		let stateSelected = document.getElementById('state');
		let selectedCountry = countrySelect.value;

		stateSelected.innerHTML = '<option value="">Select State</option>';
		

		
		if (stateObject[selectedCountry]) {
			stateObject[selectedCountry].forEach(function(state) {
				let option = document.createElement('option');
				option.value = state;
				option.textContent = state;
				stateSelected.appendChild(option);
			});
		}
		
		
		const indian = document.getElementById('indian');
		if (selectedCountry === 'India') {
			    indian.checked = true;
			    indian.disabled = true;
		}else{
			    indian.checked = false;
			    indian.disabled = false;
	     }
		
	};
	
	
function storeFormData(event) {
	event.preventDefault();
	
	if (validateForm()) {
		let formData = {
			name : document.getElementById('name').value,
			email : document.getElementById('email').value,
			country : document.getElementById('country').value,
			state : document.getElementById('state').value,
			gender:document.querySelector('input[name="gender"]:checked').value,
			indian : document.getElementById('indian').checked,
			married : document.getElementById('married').checked,
			terms:document.getElementById('agreeCheckbox').checked
		};
		
		sessionStorage.setItem('formData', JSON.stringify(formData));
		
		
		window.location.href = 'display.html';
	}
}

document.addEventListener('DOMContentLoaded',displayPage());

function displayPage(){
	let storedFormData=sessionStorage.getItem('formData');
	if(storedFormData){
		let formData=JSON.parse(storedFormData);
		let formDisplay=document.getElementById('data');
		
		for(const [key,value] of Object.entries(formData)){
			let displayValue=value;
			
			if(key==='gender'){
				displayValue=value?'Male':'Female';
			}
			else if(typeof displayValue==='boolean'){
				displayValue=value?'Yes':'No';
			}
			
			formDisplay.innerHTML+=`<p><strong>${key.charAt(0).toUpperCase()+key.slice(1)}</strong> : ${displayValue}</p>`;
		}
	}
};