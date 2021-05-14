import React from 'react';
import { Switch } from 'react-router-dom';
import Route from './Route';

import LandingPage from '../pages/LandingPage';
import SignIn from '../pages/SignIn';
import SignUp from '../pages/SignUp';

import Dashboard from '../pages/Dashboard';
import NewClassPage from '../pages/NewClass';
import CursoInfo from '~/pages/CursoInfo';
import CursoEdit from '~/pages/CursoEdit';

export default function Routes() {
  return (
    <Switch>
      <Route path="/" exact component={LandingPage} />
      <Route path="/signin" exact component={SignIn} isLoginOrSignup />
      <Route path="/signup" exact component={SignUp} isLoginOrSignup />

      <Route path="/dashboard" component={Dashboard} isPrivate />
      <Route path="/newClass" component={NewClassPage} isPrivate />

      <Route path="/cursoInfo/:idCurso" component={CursoInfo} isPrivate />
      <Route
        path="/cursoEdit/:idCurso"
        component={CursoEdit}
        isPrivate
        onlyTeacher
      />
    </Switch>
  );
}
