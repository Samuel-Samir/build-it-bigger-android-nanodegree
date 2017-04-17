package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;


/**
 * Created by samuel on 05/04/17.
 */

public class FetchJokesTest extends AndroidTestCase {

    public void testJoke(){
        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask(getContext());
        asyncTask.execute(new JokeListener() {
            @Override
            public void onJokeTold(String joke) {
                assert joke != null;
                String[] jokes = new String[3];
                jokes[0] = "This is totally a funny joke";
                jokes[1] = "Are you ill?\n" +"No, just felling abit off :D ";
                jokes[2] = "Why do programmers always mix up Halloween and Christmas?\n" + "Because Oct 31 equals Dec 25.";
                int count =0 ;
                for (int i=0 ;i< jokes.length ;i++)
                {
                    if(jokes.equals(jokes[i]))
                    {
                        count=1;
                        break;
                    }
                }
                assert count == 1;
            }
        });
    }

}
