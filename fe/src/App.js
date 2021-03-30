import React from 'react'
import { Link, Route } from 'react-router-dom'
import ItemSave from './ItemSave'
import ItemAll from './ItemAll'
import ItemOne from './ItemOne'
import ItemEdit from './ItemEdit'

const App = () => {
  return (<>
  <ul style={{width:200, margin: "0 auto", marginTop: 100}}>
  <li><Link to='/item-save'>Item Save</Link></li>
  <li><Link to='/item-all'>Item All</Link></li>
  </ul>
  
  <Route path='/' exact component={ItemSave}/>
  <Route path='/item-save' component={ItemSave} />
  <Route path='/item-all' component={ItemAll}/>
  <Route path='/item-one/:id' component={ItemOne}/>
  <Route path='/item-edit' component={ItemEdit}/>
  
  </>)
}

export default App;
