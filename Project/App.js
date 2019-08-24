import React from 'react';

import HomePage from './components/HomePage/HomePage';
import { BrowserRouter as Router, Route} from 'react-router-dom'
import LoginPage from './components/Login/LoginPage';

function App() {
return (
<Router>
<div className="App">
<Route exact path="/" component={LoginPage}></Route>
</div>
</Router>
);
}

export default App;
