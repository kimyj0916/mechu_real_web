import { createWebHistory, createRouter } from 'vue-router';
import Home from '../components/Home.vue';
import Board from '../components/Board.vue';


const routes = [
  {
    path: "/",
    component: Home,
  },
  {
    path: "/board",
    component: Board,
  }
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router; 