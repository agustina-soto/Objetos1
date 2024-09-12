package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

public class WallPostImpl implements WallPost {
	private String text;
	private int cantLikes;
	private boolean isFeatured;
	
	/*
	* Permite construir una instancia del WallpostImpl.
	* Luego de la invocación, debe tener como texto: “Undefined post”,
	* no debe estar marcado como destacado y la cantidad de “Me gusta” debe ser 0.
	*/
	public WallPostImpl() {
		this.text = "Undefined post";
		this.cantLikes = 0;
		this.isFeatured = false;
	}

	/*
	* Retorna el texto descriptivo de la publicación
	*/
	public String getText() {
		return this.text;
	}
	
	/*
	* Asigna el texto descriptivo de la publicación
	*/
	public void setText (String descriptionText) {
		this.text = descriptionText;
	}
	
	/*
	* Retorna la cantidad de “me gusta”
	*/
	public int getLikes() {
		return this.cantLikes;
	}
	
	/*
	* Incrementa la cantidad de likes en uno.
	*/
	public void like() {
		this.cantLikes++;
	}
	
	/*
	* Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada.
	*/
	public void dislike() {
		if (this.cantLikes!= 0) this.cantLikes--;
	}
	
	/*
	* Retorna true si el post está marcado como destacado, false en caso contrario
	*/
	public boolean isFeatured() {
		return this.isFeatured;
	}
	
	/*
	* Cambia el post del estado destacado a no destacado y viceversa.
	*/
	public void toggleFeatured() {
		this.isFeatured = !this.isFeatured;
	}

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
