import React, { useState, useEffect } from 'react';
import axios from 'axios';
// Is there any issue with this code ????
function UserProfile() {
    const [user, setUser] = useState(null);
    const [loading, setLoading] = useState(false);  //loading should be true
    const [error, setError] = useState('');


//umount problem

///we should use isMounted =true
    useEffect(() => {
        setLoading(true);
        axios.get('/api/user/123')///hard coded api problem
            .then(response => setUser(response.data))
            .catch(error => setError('Error fetching user data'))
            .finally(() => setLoading(false));
    }, []);

    if (loading) return <div>Loading...</div>;
    if (error) return <div>{error}</div>;

    return (
        <div>
            <h1>User Profile</h1>
            {user && (
                <div>
                    <p>Name: {user.name}</p>
                    <p>Email: {user.email}</p>
                    {/* More user details */}
                </div>
            )}
            {/* Additional unrelated UI elements */}
        </div>
    );
}