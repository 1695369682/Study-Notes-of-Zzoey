<template>
    <div class="blog-container">
      <header>
        <h1>My Blog</h1>
      </header>
      <nav>
        <ul>
          <li v-for="post in posts" :key="post.id">
            <a @click="selectPost(post)">{{ post.title }}</a>
          </li>
        </ul>
      </nav>
      <main>
        <article v-if="selectedPost">
          <h2>{{ selectedPost.title }}</h2>
          <p>{{ selectedPost.content }}</p>
        </article>
        <div v-else>
          <p>Select a post to read</p>
        </div>
      </main>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        posts: [
          {
            id: 1,
            title: "First Post",
            content: "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
          },
          {
            id: 2,
            title: "Second Post",
            content: "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
          },
          {
            id: 3,
            title: "Third Post",
            content: "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris."
          }
        ],
        selectedPost: null
      };
    },
    beforeMount:{
      function(){
          console.log(111);
      }
     
    },
    methods: {
      selectPost(post) {
        this.selectedPost = post;
      }
    }
  };
  </script>
  
  <style scoped>
  .blog-container {
    display: flex;
    flex-direction: column;
    align-items: center;
    margin: 20px;
  }
  
  header {
    text-align: center;
    margin-bottom: 20px;
  }
  
  nav ul {
    list-style-type: none;
    padding: 0;
  }
  
  nav li {
    margin-bottom: 10px;
  }
  
  article {
    text-align: justify;
    margin-bottom: 20px;
  }
  </style>