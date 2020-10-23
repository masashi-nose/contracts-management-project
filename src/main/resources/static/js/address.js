
const getAddressBtn = document.getElementById("searchAddress");

getAddressBtn.addEventListener('click', () => {
    AjaxZip3.zip2addr('zipcode', '', 'address', 'address');
    console.log('OK');
});