import axios from 'axios';

const instance = axios.create({
  baseURL: 'http://localhost:8080/api', // Ensure your backend is running at this address
});

export default instance;
