


//fronted example


const UserProfile=({user})=>{
   switch(user.role){
     case 'admin':
      return <AdminView user={user}/>;
case "editor":
return<EditorView user={user}/>;
default:
return <StandView user={suer}/>


}
}
return <div>{displayInfo()}</div>;


//it not following the open close principlee
